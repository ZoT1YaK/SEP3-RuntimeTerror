using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
     Task<User> CreateUserAsync(UserCreationDTO userToCreate);
    // Task<UserCreationDTO> LogIn(string username, string password);
}