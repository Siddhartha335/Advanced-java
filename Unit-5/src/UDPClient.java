import java.io.IOException;
import java.net.*;

public class UDPClient {
    DatagramSocket ds;
    DatagramPacket packet;
    public UDPClient() throws IOException {
        ds = new DatagramSocket();
        byte[] buff = new byte[256];
        InetAddress address = InetAddress.getByName("localhost");
        String s = "hello Server. I am Client";
        packet = new DatagramPacket(buff,buff.length,address,4445);
        ds.send(packet);

        //Get response
        packet = new DatagramPacket(buff,buff.length);
        ds.receive(packet);

        //Send response



        //display response
        String recieved = new String(packet.getData());
        System.out.println(recieved.length());
        System.out.println("The response from the server is:" + recieved);

        ds.close();
    }

    public static void main(String[] args) throws IOException {
        new UDPClient();
    }
}
