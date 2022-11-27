using System.Runtime.CompilerServices;
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

        /*await userServiceClient.CreateUserAsync(new RegisterUser
        {
            Username = user.userName,
            Password = user.password,
            FName = user.FirstName,
            LName = user.LastName,
            Credits = user.Credits,
            Type = user.type
        });
        
        return await Task.FromResult(user);*/

        var userToCreate = new global::RegisterUser
        {
            Username = user.userName,
            Password = user.password,
            FName = user.FirstName,
            LName = user.LastName,
            Credits = user.Credits,
            Type = user.type
        };

        User grpcUserToCreate = await userServiceClient.CreateUserAsync(userToCreate);

        return ConvertGrpcUserToSharedUser(grpcUserToCreate);
    }

    public Task<Shared.Models.User?> GetByUsernameAsync(string userName)
    {
        throw new NotImplementedException();
    }
    
    private Shared.Models.User ConvertGrpcUserToSharedUser(User grpcUser)
    {
        var sharedUser = new Shared.Models.User
        {
            userName = grpcUser.Username,
            password = grpcUser.Password,
            FirstName = grpcUser.FName,
            LastName = grpcUser.LName,
            Credits = grpcUser.Credits,
            type = grpcUser.Type
        };
        
        return sharedUser;
    }
}