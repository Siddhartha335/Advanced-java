import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    ServerSocket ss;
    Socket soc;
    public TCPServer() throws IOException {
        ss = new ServerSocket(1254);
        soc = ss.accept(); //It accepts the connection of socket
        DataInputStream in = new DataInputStream(soc.getInputStream());
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        out.writeUTF("Hello Client, I recieved your message!");

        String request = in.readUTF();
        System.out.println("Request is: " + request);
        in.close();
        out.close();
        ss.close();
        soc.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Server is running on port 1254");
        new TCPServer();
    }

}
