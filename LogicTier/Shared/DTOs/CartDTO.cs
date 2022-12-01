using Shared.Models;

namespace Shared.DTOs;

public class CartDTO
{
    public int ProductId { get; set; }
    
    public string UserName { get; set; }
    
    public int Quantity { get; set; }
    
    public int Total { get; set; }
}