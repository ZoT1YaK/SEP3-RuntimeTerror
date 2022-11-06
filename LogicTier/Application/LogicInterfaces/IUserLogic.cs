using Shared.DTOs;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
     Task<UserCreationDTO> CreateUserAsync(UserCreationDTO userToCreate);
    Task<UserCreationDTO> LogIn(string username, string password);
}