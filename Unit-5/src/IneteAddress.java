import java.net.InetAddress;
import java.net.UnknownHostException;

public class IneteAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip;
        ip = InetAddress.getByName("www.google.com");
        System.out.println("Hostname:" + ip.getHostName());
        System.out.println("Hostname:" + ip.getHostAddress());
        System.out.println("Hostname:" + ip.getCanonicalHostName());
    }
}
