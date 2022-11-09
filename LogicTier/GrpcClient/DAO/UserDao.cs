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

    public async Task CreateUserAsync(Shared.Models.User user)
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

        _ = await userServiceClient.CreateUserAsync(userToCreate);
    }

    public Task<Shared.Models.User?> GetByUsernameAsync(string userName)
    {
        throw new NotImplementedException();
    }
}