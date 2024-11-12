import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
    byte[] buff = new byte[5];
    DatagramSocket ds  = new DatagramSocket(4445);
    public UDPServer() throws IOException {
        DatagramPacket packet = new DatagramPacket(buff,buff.length);
        ds.receive(packet);
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "hello Client. I am server";
        buff = s.getBytes();

        //Send response to the client at address and port
        packet = new DatagramPacket(buff,buff.length,address,port);
        ds.send(packet);
        ds.close();
    }

    public static void main(String[] args) throws IOException {
        new UDPServer();
    }
}
