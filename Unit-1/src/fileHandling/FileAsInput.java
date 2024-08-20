package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileScanner {
    public Scanner inputFile;
    public void openFile() throws FileNotFoundException {
        inputFile = new Scanner(new File("/Users/siddharthraut/Desktop/College/7th-sem/Advanced-java/Unit-1/src/fileHandling/input.txt"));
    }
    public void readFile() {
        while(inputFile.hasNext()) {
            String s1 = inputFile.next();
            String s2 = inputFile.next();
            String s3 = inputFile.next();
            System.out.println(String.format("%s %s %s",s1,s2,s3));
        }

    }
    public void closeFile() {
    inputFile.close();
    }
}
public class FileAsInput {
    public static void main(String[] args) throws FileNotFoundException {
        FileScanner file = new FileScanner();
        file.openFile();
        file.readFile();
        file.closeFile();
    }
}
