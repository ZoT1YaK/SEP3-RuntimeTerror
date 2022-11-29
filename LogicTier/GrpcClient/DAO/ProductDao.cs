using Application.DAOInterfaces;

namespace GrpcClient.DAO;

public class ProductDao : IProductDAO
{
    private ProductService.ProductServiceClient productService;


    public ProductDao(ProductService.ProductServiceClient productService)
    {
        this.productService = productService;
    }

    public async Task<Shared.Models.Product> RegisterProductAsync(Shared.Models.Product product)
    {
        var registerProduct = new Product
        {
            Name = product.Name,
            ImgPath = product.ImagePath,
            Price = product.Price,
            Description = product.Description,
            Category = ConvertSharedCategoryToGrpcCategory(product.Category)
        };

        await productService.RegisterProductAsync(registerProduct);

        return product;
    }

    public async Task<IEnumerable<Shared.Models.Product>> GetProductsAsync()
    {
        ProductItems productsProto = await productService.GetProductsAsync(new Void());
    
        var list = new List<Shared.Models.Product>();
    
        foreach (var product in productsProto.Product)
        {
            if (product == null)
            {
                continue;
            }

            Shared.Models.Product productGrpcToShared = ConvertGrpcProductToSharedProduct(product);
            
            list.Add(productGrpcToShared);
        }

        return list;
    }

    public async Task<Shared.Models.Product> FindProductByIdAsync(string productId)
    {
        SearchField id = new SearchField
        {
            Search = productId
        };

        Product product = await productService.FindProductAsync(id);

        Shared.Models.Product productToFind = new Shared.Models.Product
        {
            Id = product.Id,
            Name = product.Name,
            ImagePath = product.ImgPath,
            Price = product.Price,
            Description = product.Description
        };

        return productToFind;
    }

    private Shared.Models.Product ConvertGrpcProductToSharedProduct(Product product)
    {
        return new Shared.Models.Product
        {
            Id = product.Id,
            Name = product.Name,
            ImagePath = product.ImgPath,
            Price = product.Price,
            Description = product.Description,
            Category = ConvertGrpcCategoryToSharedCategory(product.Category)
        };
    }

    private Shared.Models.Category ConvertGrpcCategoryToSharedCategory(Category category)
    {
        var category1 = new Shared.Models.Category
        {
            Name = category.CategoryName
        };
        return category1;
    }
    
    private Category ConvertSharedCategoryToGrpcCategory(Shared.Models.Category category)
    {
        return new Category
        {
            CategoryName = category.Name
        };
    }
}