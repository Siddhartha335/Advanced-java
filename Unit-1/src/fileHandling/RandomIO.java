package fileHandling;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomIO {
    RandomAccessFile raf;
    public RandomIO() throws IOException {
        raf = new RandomAccessFile("/Users/siddharthraut/Desktop/College/7th-sem/Advanced-java/Unit-1/src/fileHandling/test1.txt","rw");
        raf.writeChar('X');
        raf.writeInt(24);
        raf.writeDouble(34.45645);
        raf.writeBoolean(true);
        raf.seek(0); //brings back to the initial index
        System.out.println(raf.readChar());
        System.out.println(raf.readInt());
        System.out.println(raf.readDouble());
        System.out.println(raf.readBoolean());
        raf.seek(raf.length());
        raf.writeChars("Siddhartha");
//        raf.seek(raf.length() - 18);
        System.out.println(raf.readChar());
    }

    public static void main(String[] args) throws IOException {
        new RandomIO();
    }
}
