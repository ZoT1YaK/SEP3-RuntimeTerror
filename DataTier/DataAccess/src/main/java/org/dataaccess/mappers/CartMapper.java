package org.dataaccess.mappers;

import org.dataaccess.protobuf.Cart;

public abstract class CartMapper
{
    public static Cart mapToProto(org.dataaccess.Shared.Cart cart)
    {
        return Cart.newBuilder()
                .setId(cart.getId())
                .setUsername(cart.getUsername().getUsername())
                .setProductId(cart.getProductId().getId())
                .setQuantity(cart.getQuantity())
                .setTotal(cart.getTotal())
                .build();
    }
}
