using Application.DAOInterfaces;
using Shared.DTOs;

namespace GrpcClient.DAO;

public class CartDao : ICartDAO
{
    private CartService.CartServiceClient cartService;

    private ProductService.ProductServiceClient productService;

    private ProductDao productDao;

    public CartDao(CartService.CartServiceClient cartService, ProductService.ProductServiceClient productService)
    {
        this.cartService = cartService;
        this.productService = productService;
    }

    public async Task AddToCartAsync(CartDTO dto)
    {
        /*Cart cart = ConvertSharedCartToGrpcCart(dto);*/

        var cart = new Cart
        {
            ProductId = dto.ProductId,
            Username = dto.UserName,
            Quantity = dto.Quantity,
            Total = dto.Total
        };
        await cartService.AddToCartAsync(cart);
    }

    public async Task<ICollection<Shared.Models.Cart>> GetAllFromCartAsync(string username)
    {
        var sf = new SearchField
        {
            Search = username
        };

        CartItems cartItems = await cartService.GetAllFromCartAsync(sf);

        ProductItems productItems = await productService.GetProductsAsync(new Void());

        ICollection<Shared.Models.Cart> collection = new List<Shared.Models.Cart>();

        foreach (var cartItem in cartItems.CartProducts)
        {
            if (cartItem == null)
                continue;

            Shared.Models.Product product = new Shared.Models.Product();
            foreach (var productItem in productItems.Product)
            {
                if (productItem.Id == cartItem.ProductId)
                {
                    product.Id = productItem.Id;
                    product.Name = productItem.Name;
                    product.Price = productItem.Price;
                }
            }

            Shared.Models.Cart cart = new Shared.Models.Cart
            {
                Id = cartItem.Id,
                UserName = cartItem.Username,
                Product = product,
                Quantity = cartItem.Quantity,
                Total = cartItem.Total
            };
            collection.Add(cart);
        }

        return collection;
    }

    public async Task DeleteAllFromCartAsync(string username)
    {
        var sf = new SearchField
        {
            Search = username
        };

        await cartService.DeleteAllFromCartAsync(sf);
    }

    public Cart ConvertSharedCartToGrpcCart(CartDTO dto)
    {
        return new Cart
        {
            ProductId = dto.ProductId,
            Username = dto.UserName,
            Quantity = dto.Quantity,
            Total = dto.Total
        };
    }
}