package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.ProductDAO;
import org.dataaccess.mappers.ProductMapper;
import org.dataaccess.protobuf.*;
import org.dataaccess.protobuf.Void;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

@GRpcService
public class ProductService extends ProductServiceGrpc.ProductServiceImplBase
{
    @Autowired
    private ProductDAO productDAO;

    public ProductService() {
    }

    @Override
    public void registerProduct(Product request, StreamObserver<Product> responseObserver)
    {
        org.dataaccess.Shared.Product product = new org.dataaccess.Shared.Product(
                request.getName(),
                request.getImgPath(),
                request.getPrice(),
                request.getDescription()
        );

        org.dataaccess.Shared.Product registerProduct = productDAO.registerProduct(product);

        responseObserver.onNext(ProductMapper.mapToProto(registerProduct));
        responseObserver.onCompleted();
    }

    @Override
    public void getProducts(Void request, StreamObserver<ProductItems> responseObserver)
    {
        Collection<org.dataaccess.Shared.Product> products = productDAO.getProducts();

        Collection<Product> productCollection = new ArrayList<>();

        for (var product: products)
        {
           productCollection.add(ProductMapper.mapToProto(product));
        }

        ProductItems productItems = ProductItems.newBuilder().addAllProduct(productCollection).build();

        responseObserver.onNext(productItems);
        responseObserver.onCompleted();
    }

    @Override
    public void findProduct(SearchField request, StreamObserver<Product> responseObserver)
    {
        org.dataaccess.Shared.Product product = productDAO.findProduct(request.getSearch());

        responseObserver.onNext(ProductMapper.mapToProto(product));
        responseObserver.onCompleted();
    }
}
