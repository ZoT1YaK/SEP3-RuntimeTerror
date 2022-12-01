package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.CartDAO;
import org.dataaccess.DAOInterfaces.ProductDAO;
import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.mappers.CartMapper;
import org.dataaccess.protobuf.*;
import org.dataaccess.protobuf.Void;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;

@GRpcService
public class CartService extends CartServiceGrpc.CartServiceImplBase
{
    @Autowired
    private CartDAO cartDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ProductDAO productDAO;

    public CartService() {
    }

    @Override
    public void addToCart(Cart request, StreamObserver<Void> responseObserver)
    {
        org.dataaccess.Shared.Cart cart = new org.dataaccess.Shared.Cart(
                userDAO.findUser(request.getUsername()),
                productDAO.findProduct(String.valueOf(request.getProductId())),
                request.getQuantity(),
                request.getTotal()
        );

        cartDAO.registerCart(cart);

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllFromCart(SearchField request, StreamObserver<CartItems> responseObserver)
    {
        org.dataaccess.Shared.User user = userDAO.findUser(request.getSearch());
        Collection<org.dataaccess.Shared.Cart> cartItemsByUsername = cartDAO.getFromCartByUsername(user);

        Collection<Cart> cartProto = new ArrayList<>();

        if (cartItemsByUsername == null){
            responseObserver.onError(new Exception("Cart products not found"));
            return;
        }

        for (org.dataaccess.Shared.Cart cartItems : cartItemsByUsername)
        {
            cartProto.add(CartMapper.mapToProto(cartItems));
        }

        CartItems cart = CartItems.newBuilder().addAllCartProducts(cartProto).build();

        responseObserver.onNext(cart);
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void deleteAllFromCart(SearchField request, StreamObserver<Void> responseObserver)
    {
        cartDAO.deleteFromCartByUsername(request.getSearch());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }
}
