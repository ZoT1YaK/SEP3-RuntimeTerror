using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ProductsController : ControllerBase
{
    private readonly IProductLogic productLogic;

    public ProductsController(IProductLogic productLogic)
    {
        this.productLogic = productLogic;
    }
    
    [HttpGet]
    public async Task<IActionResult> GetAsync()
    {
        try
        {
            var created = await productLogic.GetProductsAsync();
            return Created($"/products", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}