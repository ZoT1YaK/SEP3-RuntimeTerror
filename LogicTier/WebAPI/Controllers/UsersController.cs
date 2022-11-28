using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;


namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UserController : ControllerBase
{
    private readonly IUserLogic UserLogic;
    /*private readonly IConfiguration config;*/

    public UserController(IUserLogic userLogic/*, IConfiguration config*/)
    {
        UserLogic = userLogic;
        /*this.config = config;*/
    }
    
    /*[HttpPost(), Route("register")]*/
    
    
    //ADD user for action result??
    [HttpPost("register")]
    public async Task<IActionResult> CreateUserAsync(UserCreationDTO dto)
    {
        try
        {
            /*Shared.Models.User user = await UserLogic.CreateUserAsync(dto);
            return Created($"/users/{user.userName}", user);*/
            var user = await UserLogic.CreateUserAsync(dto);
            return Ok(user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return BadRequest(e.Message);
        }
    }

    [HttpPost("login")]
    public async Task<IActionResult> LoginUserAsync(UserLoginDTO dto)
    {
        try
        {
            var user = await UserLogic.LoginUserAsync(dto);
            return Ok(user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return BadRequest(e.Message);
        }
    }
}