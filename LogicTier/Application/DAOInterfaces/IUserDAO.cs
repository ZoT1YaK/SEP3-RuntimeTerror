using Shared.DTOs;
using Shared.Models;

namespace Application.DAOInterfaces;

public interface IUserDAO
{
    Task CreateUserAsync(User user);
    // Task<User?> GetByUsernameAsync(string userName);
    
}