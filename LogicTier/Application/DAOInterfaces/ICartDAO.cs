using Shared.DTOs;
using Shared.Models;

namespace Application.DAOInterfaces;

public interface ICartDAO
{
    public Task AddToCartAsync(CartDTO cart);

    public Task<ICollection<Cart>> GetAllFromCartAsync(string username);

    public Task DeleteAllFromCartAsync(string username);
}