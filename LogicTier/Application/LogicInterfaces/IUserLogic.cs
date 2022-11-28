using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
     Task<User> CreateUserAsync(UserCreationDTO userCreationDto);

     Task<User> LoginUserAsync(UserLoginDTO userLoginDto);
}