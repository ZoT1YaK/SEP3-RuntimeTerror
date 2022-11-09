import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.dataaccess.FileData.FileContext;
import service.UserServiceImpl;

import java.io.IOException;

public class GrpcServer
{
    public static void main(String[] args) throws IOException, InterruptedException {
        FileContext context = new FileContext();

        Server server = ServerBuilder
                .forPort(8084)
                .addService(new UserServiceImpl(context))
                .build();

        server.start();

        server.awaitTermination();
    }
}
