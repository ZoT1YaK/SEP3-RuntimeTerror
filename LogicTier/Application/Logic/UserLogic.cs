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
    
    public async Task<User> CreateUserAsync(UserCreationDTO dto)
    {
        // User? existing = await userDao.GetByUsernameAsync(dto.userName);
        // if (existing != null)
        //     throw new Exception("Username already taken!");

        ValidateData(dto);

        User user = new User
        {
            userName = dto.userName,
            password = dto.password,
            FirstName = dto.FirstName,
            LastName = dto.LastName,
            Credits = dto.Credits,
            type = dto.type
        };

        await userDao.CreateUserAsync(user);
    
        return user;
    }

    /*public async Task<UserCreationDTO> LogIn(string username, string password)
    {
        throw new NotImplementedException();
    }*/
    
    private static void ValidateData(UserCreationDTO user)
    {
        string username = user.userName;

        if (username.Length > 20 || username.Length < 5)
        {
            throw new Exception("Username must have more than 5 characters and less than 21");
        }
    }
}