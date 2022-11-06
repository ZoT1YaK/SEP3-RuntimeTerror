using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;


namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]

public class UserController : ControllerBase
{
    private readonly IUserLogic UserLogic;
    private readonly IConfiguration config;

    public UserController(IUserLogic userLogic, IConfiguration config)
    {
        UserLogic = userLogic;
        this.config = config;
    }
    
    [HttpPost(), Route("register")]
    public async Task<ActionResult<User>> CreateUserAsync(UserCreationDTO dto)
    {
        try
        {
            UserCreationDTO user = await UserLogic.CreateUserAsync(dto);
            return Created($"/users/{user.userName}", user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(StatusCodes.Status500InternalServerError);
        }
    }
    
    
    
}