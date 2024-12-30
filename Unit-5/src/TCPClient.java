import java.io.*;
import java.net.Socket;

public class TCPClient {
    Socket soc;
    public TCPClient() throws IOException {
        soc = new Socket("localhost",1254);
        DataInputStream in = new DataInputStream(soc.getInputStream());
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        out.writeUTF("Hello server");

        String response = in.readUTF();
        System.out.println("Response is: " + response);
        in.close();
        out.close();
        soc.close();

    }

    public static void main(String[] args) throws IOException {
        new TCPClient();
    }

}
