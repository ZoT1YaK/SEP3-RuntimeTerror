using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IProductLogic
{
    Task<Product> RegisterProductAsync(ProductCreationDTO dto);
    
    Task<IEnumerable<Product>> GetProductsAsync();
    
    Task DeleteProductAsync(string id);

    Task UpdateProductAsync(Product product);
}