package org.dataaccess.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final String SERVICE_NAME = "CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.Cart,
      org.dataaccess.protobuf.Void> getAddToCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToCart",
      requestType = org.dataaccess.protobuf.Cart.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.Cart,
      org.dataaccess.protobuf.Void> getAddToCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.Cart, org.dataaccess.protobuf.Void> getAddToCartMethod;
    if ((getAddToCartMethod = CartServiceGrpc.getAddToCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getAddToCartMethod = CartServiceGrpc.getAddToCartMethod) == null) {
          CartServiceGrpc.getAddToCartMethod = getAddToCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.Cart, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Cart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("AddToCart"))
              .build();
        }
      }
    }
    return getAddToCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.CartItems> getGetAllFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllFromCart",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.CartItems.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.CartItems> getGetAllFromCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.CartItems> getGetAllFromCartMethod;
    if ((getGetAllFromCartMethod = CartServiceGrpc.getGetAllFromCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetAllFromCartMethod = CartServiceGrpc.getGetAllFromCartMethod) == null) {
          CartServiceGrpc.getGetAllFromCartMethod = getGetAllFromCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.CartItems>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.CartItems.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("GetAllFromCart"))
              .build();
        }
      }
    }
    return getGetAllFromCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getDeleteAllFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllFromCart",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getDeleteAllFromCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void> getDeleteAllFromCartMethod;
    if ((getDeleteAllFromCartMethod = CartServiceGrpc.getDeleteAllFromCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteAllFromCartMethod = CartServiceGrpc.getDeleteAllFromCartMethod) == null) {
          CartServiceGrpc.getDeleteAllFromCartMethod = getDeleteAllFromCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("DeleteAllFromCart"))
              .build();
        }
      }
    }
    return getDeleteAllFromCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addToCart(org.dataaccess.protobuf.Cart request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToCartMethod(), responseObserver);
    }

    /**
     */
    public void getAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.CartItems> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFromCartMethod(), responseObserver);
    }

    /**
     */
    public void deleteAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllFromCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddToCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.Cart,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_ADD_TO_CART)))
          .addMethod(
            getGetAllFromCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.CartItems>(
                  this, METHODID_GET_ALL_FROM_CART)))
          .addMethod(
            getDeleteAllFromCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_DELETE_ALL_FROM_CART)))
          .build();
    }
  }

  /**
   */
  public static final class CartServiceStub extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void addToCart(org.dataaccess.protobuf.Cart request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.CartItems> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllFromCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllFromCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.dataaccess.protobuf.Void addToCart(org.dataaccess.protobuf.Cart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.CartItems getAllFromCart(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllFromCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void deleteAllFromCart(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllFromCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> addToCart(
        org.dataaccess.protobuf.Cart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.CartItems> getAllFromCart(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllFromCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> deleteAllFromCart(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllFromCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_TO_CART = 0;
  private static final int METHODID_GET_ALL_FROM_CART = 1;
  private static final int METHODID_DELETE_ALL_FROM_CART = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_TO_CART:
          serviceImpl.addToCart((org.dataaccess.protobuf.Cart) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        case METHODID_GET_ALL_FROM_CART:
          serviceImpl.getAllFromCart((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.CartItems>) responseObserver);
          break;
        case METHODID_DELETE_ALL_FROM_CART:
          serviceImpl.deleteAllFromCart((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dataaccess.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CartServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getAddToCartMethod())
              .addMethod(getGetAllFromCartMethod())
              .addMethod(getDeleteAllFromCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
