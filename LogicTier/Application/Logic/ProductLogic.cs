using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class ProductLogic : IProductLogic
{

    private IProductDAO productDao;

    public ProductLogic(IProductDAO productDao)
    {
        this.productDao = productDao;
    }

    public async Task<Product> RegisterProductAsync(ProductCreationDTO dto)
    {
        Product product = new Product
        {
            Name = dto.Name,
            ImagePath = dto.ImagePath,
            Price = dto.Price,
            Description = dto.Description,
            Category = dto.Category
        };

        return await productDao.RegisterProductAsync(product);
    }

    public async Task<IEnumerable<Product>> GetProductsAsync()
    {
        var products = await productDao.GetProductsAsync();

        return products;
    }
}