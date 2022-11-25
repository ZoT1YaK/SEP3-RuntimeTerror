package org.dataaccess.services;

import io.grpc.stub.StreamObserver;
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
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public void loginUsers(LoginUser request, StreamObserver<User> responseObserver)
    {
        String username = request.getUsername();
        String password = request.getPassword();

        Optional<org.dataaccess.Shared.User> user = userRepository.findUser(username, password);
        if (user.isPresent())
        {
            responseObserver.onNext(UserMapper.mapProto(user.get()));
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
        String username = request.getUsername();

        Optional<org.dataaccess.Shared.User> user = userRepository.findUserByUsername(username);

        if (!user.isPresent())
        {
            org.dataaccess.Shared.User user1 = new org.dataaccess.Shared.User(
                    request.getUsername(),
                    request.getPassword(),
                    request.getFName(),
                    request.getLName(),
                    request.getCredits()
            );

            org.dataaccess.Shared.User newUser = userRepository.save(user1);

            responseObserver.onNext(UserMapper.mapProto(newUser));
            responseObserver.onCompleted();
        }
        else
        {
            responseObserver.onError(new Exception("The username already exists"));
        }
    }
}
