using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class UserLogic : IUserLogic
{

    private readonly IUserDAO userDao;

    public UserLogic(IUserDAO userDao)
    {
        this.userDao = userDao;
    }
    
    public async Task<User> CreateUserAsync(UserCreationDTO userCreationDto)
    {
        string userName = userCreationDto.userName;

        var checkUser = await userDao.FindUserAsync(userName);

        if (checkUser != null)
            throw new Exception("Username already exists");
        
        ValidateData(userCreationDto);

        var user = new User
        {
            userName = userCreationDto.userName,
            password = userCreationDto.password,
            FirstName = userCreationDto.FirstName,
            LastName = userCreationDto.LastName
        };

        return await userDao.CreateUserAsync(user);
    }

    public async Task<User> LoginUserAsync(UserLoginDTO userLoginDto)
    {
        string userName = userLoginDto.Username;
        string password = userLoginDto.Password;

        var user = await userDao.FindUserAsync(userName);

        if (user == null)
            throw new Exception("User does not exist");

        if (!password.Equals(user.password))
        {
            throw new Exception("Incorrect username or password");
        }

        return await userDao.LoginUserAsync(user);
    }

    private static void ValidateData(UserCreationDTO user)
    {
        string username = user.userName;

        if (username.Length > 20 || username.Length < 5)
        {
            throw new Exception("Username must have more than 5 characters and less than 21");
        }
    }
}