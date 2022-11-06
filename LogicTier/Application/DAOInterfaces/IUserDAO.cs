using Shared.DTOs;

namespace Application.DAOInterfaces;

public interface IUserDAO
{
    Task<UserCreationDTO> CreateUserAsync(User user);
    Task<User?> GetByUsernameAsync(string userName);
    
}