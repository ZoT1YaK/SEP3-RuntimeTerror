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
    [HttpPost]
    public async Task<ActionResult> CreateUserAsync(UserCreationDTO dto)
    {
        try
        {
            Shared.Models.User user = await UserLogic.CreateUserAsync(dto);
            return Created($"/users/{user.userName}", user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    
}