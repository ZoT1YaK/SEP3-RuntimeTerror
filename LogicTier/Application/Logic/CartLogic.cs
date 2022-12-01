using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class CartLogic : ICartLogic
{
    private ICartDAO cartDao;

    private IUserDAO userDao;

    public CartLogic(ICartDAO cartDao, IUserDAO userDao)
    {
        this.cartDao = cartDao;
        this.userDao = userDao;
    }


    public async Task AddToCartAsync(CartDTO dto)
    {
        /*Cart cart = new Cart
        {
            UserName = dto.UserName,
            Product = dto.Product,
            Quantity = dto.Quantity,
            Total = dto.Total
        };*/

        await cartDao.AddToCartAsync(dto);
    }

    public async Task<ICollection<Cart>> GetAllFromCartAsync(string username)
    {
        if (userDao.FindUserAsync(username).Equals(null))
        {
            throw new Exception("The user does not exists");
        }

        return await cartDao.GetAllFromCartAsync(username);
    }

    public async Task DeleteAllFromCartAsync(string username)
    {
        if (userDao.FindUserAsync(username).Equals(null))
        {
            throw new Exception("The user does not exists");
        }

        await cartDao.DeleteAllFromCartAsync(username);
    }
}