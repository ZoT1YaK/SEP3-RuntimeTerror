using Application.DAOInterfaces;
using Shared.DTOs;

namespace GrpcClient.DAO;

public class UserDao : IUserDAO
{
    public Task<UserCreationDTO> CreateUserAsync(User user)
    {
        throw new NotImplementedException();
    }

    public Task<UserCreationDTO> CreateUserAsync(Shared.DTOs.User user)
    {
        throw new NotImplementedException();
    }

    public Task<Shared.DTOs.User?> GetByUsernameAsync(string userName)
    {
        throw new NotImplementedException();
    }
}