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
            inStock = dto.InStock,
            Category = dto.Category
        };

        return await productDao.RegisterProductAsync(product);
    }

    public async Task<IEnumerable<Product>> GetProductsAsync()
    {
        var products = await productDao.GetProductsAsync();

        return products;
    }

    public async Task DeleteProductAsync(string id)
    {
        await productDao.DeleteProductAsync(id);
    }

    public async Task UpdateProductAsync(Product product)
    {
        string productId = product.Id.ToString();

        var checkProduct = await productDao.FindProductByIdAsync(productId);

        if (checkProduct == null)
            throw new Exception("Product not exists");

        var productToSend = new Product
        {
            Id = product.Id,
            Name = product.Name,
            ImagePath = product.ImagePath,
            Price = product.Price,
            Description = product.Description,
            inStock = product.inStock
        };

        await productDao.UpdateProductAsync(productToSend);
    }
}