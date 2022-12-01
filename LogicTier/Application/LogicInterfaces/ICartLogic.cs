using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ICartLogic
{
    public Task AddToCartAsync(CartDTO dto);

    public Task<ICollection<Cart>> GetAllFromCartAsync(string username);

    public Task DeleteAllFromCartAsync(string username);
}