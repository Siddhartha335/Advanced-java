import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    Socket soc;
    public TCPClient() throws IOException, UnknownHostException {
        soc = new Socket("localhost",1254);
        DataInputStream in = new DataInputStream(soc.getInputStream());
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        out.writeUTF("Hello Server");  //send request

        //get response
        String response = in.readUTF();
        System.out.println("The response from the server is: " + response);
        soc.close();
        in.close();
        out.close();

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Server is running on port 1254");
        new TCPClient();
    }

}
