package service;

import io.grpc.stub.StreamObserver;
import org.dataaccess.FileData.FileContext;
import org.dataaccess.protobuf.User;
import org.dataaccess.protobuf.UserServiceGrpc;
import org.dataaccess.protobuf.UsersExist;
import org.dataaccess.protobuf.Void;

import java.util.ArrayList;
import java.util.Collection;

public class UserServiceImpl  extends UserServiceGrpc.UserServiceImplBase
{
    private FileContext fileContext;

    public UserServiceImpl(FileContext fileContext)
    {
        this.fileContext = fileContext;
    }

    @Override
    public void createUser(User request, StreamObserver<User> responseObserver)
    {
        User user = User.newBuilder()
                .setUsername(request.getUsername())
                .setPassword(request.getPassword())
                .setFName(request.getFName())
                .setLName(request.getLName())
                .setCredits(request.getCredits())
                .setType(request.getType())
                .build();

        fileContext.users().add(user);
        fileContext.saveChanges();

        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(Void request, StreamObserver<UsersExist> responseObserver)
    {
        UsersExist.Builder response = UsersExist.newBuilder();

        ArrayList<User> users = (ArrayList<User>) fileContext.users();

        Collection<User> userCollection = new ArrayList<>();

        for (int i = 0; i < users.size(); i++)
        {
            User user = User.newBuilder()
                    .setUsername(users.get(i).getUsername())
                    .setPassword(users.get(i).getPassword())
                    .setFName(users.get(i).getFName())
                    .setLName(users.get(i).getLName())
                    .setCredits(users.get(i).getCredits())
                    .setType(users.get(i).getType())
                    .build();

            userCollection.add(user);
        }

        response.addAllUsers(userCollection);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
