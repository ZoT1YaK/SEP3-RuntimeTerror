using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.Models;

namespace Application.Logic;

public class ProductLogic : IProductLogic
{

    private IProductDAO productDao;

    public ProductLogic(IProductDAO productDao)
    {
        this.productDao = productDao;
    }

    public async Task<IEnumerable<Product>> GetProductsAsync()
    {
        var products = await productDao.GetProductsAsync();

        return products;
    }
}