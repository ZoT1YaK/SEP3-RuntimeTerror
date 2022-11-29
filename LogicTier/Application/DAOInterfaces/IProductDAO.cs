using Shared.Models;

namespace Application.DAOInterfaces;

public interface IProductDAO
{
    
    // Task<Product> CreateProductAsync(Product product); 
    
    Task<IEnumerable<Product>> GetProductsAsync();

    Task<Product> FindProductByIdAsync(string productId);
}