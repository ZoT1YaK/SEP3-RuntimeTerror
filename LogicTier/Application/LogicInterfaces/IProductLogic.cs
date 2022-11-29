using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IProductLogic
{
    // Task<Product> CreateProductAsync(ProductCreationDTO dto);
    
    Task<IEnumerable<Product>> GetProductsAsync();
}