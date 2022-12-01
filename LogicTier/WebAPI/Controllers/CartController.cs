using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class CartController : ControllerBase
{
    private readonly ICartLogic cartLogic;

    public CartController(ICartLogic cartLogic)
    {
        this.cartLogic = cartLogic;
    }

    [HttpPost]
    public async Task<IActionResult> RegisterAsync(CartDTO dto)
    {
        try
        {
            await cartLogic.AddToCartAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<IActionResult> GetAsync([FromQuery] string username)
    {
        try
        {
            var cart = await cartLogic.GetAllFromCartAsync(username);
            return Created("/cartitems", cart);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete]
    public async Task<ActionResult> DeleteAsync([FromQuery] string username)
    {
        try
        {
            await cartLogic.DeleteAllFromCartAsync(username);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}