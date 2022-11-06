using Application.DAOInterfaces;
using Shared.DTOs;

namespace GrpcClient.DAO;

public class UserDao : IUserDAO
{
    public Task<UserCreationDTO> CreateUserAsync(User user)
    {
        throw new NotImplementedException();
    }

    public Task<User?> GetByUsernameAsync(string userName)
    {
        throw new NotImplementedException();
    }
}