import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.UserService;
import org.lognet.springboot.grpc.GRpcService;

import java.io.IOException;

@GRpcService
public class GrpcServer
{
    public static void main(String[] args)
            throws IOException, InterruptedException
    {

        Server server = ServerBuilder
                .forPort(8084)
                .addService(new UserService())
                .build();

        server.start();
        server.awaitTermination();
    }
}
