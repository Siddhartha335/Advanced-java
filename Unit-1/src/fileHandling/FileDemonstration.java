package fileHandling;

//Stream Classes  - InputStream and CharacterStream

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemonstration {
    FileInputStream in = null;
    FileOutputStream out = null;
    public FileDemonstration() throws IOException {
        in = new FileInputStream("/Users/siddharthraut/Desktop/College/7th-sem/Advanced-java/Unit-1/src/fileHandling/input.txt");
        out = new FileOutputStream("/Users/siddharthraut/Desktop/College/7th-sem/Advanced-java/Unit-1/src/fileHandling/output.txt");
        int ch;
        while((ch = in.read()) !=-1) { //read bytes till end of file
            out.write(ch);
        }
    }

    public static void main(String[] args) throws IOException {
        new FileDemonstration();
    }
}
