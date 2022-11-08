using Application.DAOInterfaces;
using Shared.DTOs;

namespace GrpcClient.DAO;

public class UserDao : IUserDAO
{

    private UserService.UserServiceClient userServiceClient;

    public UserDao(UserService.UserServiceClient userServiceClient)
    {
        this.userServiceClient = userServiceClient;
    }

    public async Task<UserCreationDTO> CreateUserAsync(Shared.Models.User user)
    {
        var userToCreate = new User
        {
            Username = user.userName,
            Credits = user.Credits,
            FName = user.FirstName,
            LName = user.LastName,
            Password = user.password,
            Type = user.type
        };

        var userCreationDTO = new UserCreationDTO(user.userName, user.password, user.FirstName, user.LastName,
            user.Credits, user.type);

        await userServiceClient.CreateUserAsync(userToCreate);

        return userCreationDTO;
    }

    public Task<Shared.Models.User?> GetByUsernameAsync(string userName)
    {
        throw new NotImplementedException();
    }
}