import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLConnectionDemo {
    public URLConnectionDemo() {
        try {
            URL url = new URL("https://glowing-froyo-4b18fe.netlify.app/");
            java.net.URLConnection action = url.openConnection();
            InputStream stream = action.getInputStream();
            int i;
            while ((i=stream.read() )!= i) {
                System.out.print((char) i);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new URLConnectionDemo();
    }
}
