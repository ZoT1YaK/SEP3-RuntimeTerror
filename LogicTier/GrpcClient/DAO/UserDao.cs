using Application.DAOInterfaces;

namespace GrpcClient.DAO;

public class UserDao : IUserDAO
{

    private UserService.UserServiceClient userServiceClient;

    public UserDao(UserService.UserServiceClient userServiceClient)
    {
        this.userServiceClient = userServiceClient;
    }

    public async Task<Shared.Models.User> CreateUserAsync(Shared.Models.User user)
    {
        /*var userToCreate = new User
        {
            Username = user.userName,
            Credits = user.Credits,
            FName = user.FirstName,
            LName = user.LastName,
            Password = user.password,
            Type = user.type
        };

        _ = await userServiceClient.CreateUserAsync(userToCreate);*/

        await userServiceClient.CreateUserAsync(new RegisterUser
        {
            Username = user.userName,
            Password = user.password,
            FName = user.FirstName,
            LName = user.LastName,
            Credits = user.Credits,
            Type = user.type
        });
        
        return await Task.FromResult(user);
    }

    public Task<Shared.Models.User?> GetByUsernameAsync(string userName)
    {
        throw new NotImplementedException();
    }
}