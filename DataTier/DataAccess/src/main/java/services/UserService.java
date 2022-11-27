package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.mappers.UserMapper;
import org.dataaccess.protobuf.LoginUser;
import org.dataaccess.protobuf.RegisterUser;
import org.dataaccess.protobuf.User;
import org.dataaccess.protobuf.UserServiceGrpc;
import org.dataaccess.repositories.UserRepository;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase
{
    @Autowired
    private UserDAO userDAO;

    public UserService()
    {
    }

    @Override
    public void loginUsers(LoginUser request, StreamObserver<User> responseObserver)
    {
        org.dataaccess.Shared.User user = new org.dataaccess.Shared.User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        org.dataaccess.Shared.User checkUser = userDAO.loginUser(user);
        if (checkUser != null)
        {
            responseObserver.onNext(UserMapper.mapProto(checkUser));
            responseObserver.onCompleted();
        }
        else
        {
            responseObserver.onError(new Exception("Incorrect username or password"));
        }
    }

    @Override
    public void createUser(RegisterUser request, StreamObserver<User> responseObserver)
    {
        org.dataaccess.Shared.User user = new org.dataaccess.Shared.User(
                request.getUsername(),
                request.getPassword(),
                request.getFName(),
                request.getLName(),
                request.getCredits(),
                request.getType());

        org.dataaccess.Shared.User checkUser = userDAO.registerUser(user);

        responseObserver.onNext(UserMapper.mapProto(checkUser));
        responseObserver.onCompleted();

    }
}
