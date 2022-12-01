using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ICartLogic
{
    /*public Task RegisterCartAsync(CartCreationDTO dto);*/
    
    public Task RegisterCartItemAsync(CartItemCreationDTO dto);

    public Task<ICollection<CartItem>> GetAllFromCartAsync(string username);

    public Task DeleteAllFromCartAsync(string username);
}