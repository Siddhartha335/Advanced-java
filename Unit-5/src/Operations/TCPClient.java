package Operations;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        // Define the server address and port number
        String serverAddress = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(serverAddress, port)) {
            // Create input and output streams to communicate with the server
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            // Read two integers from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the first integer: ");
            int num1 = Integer.parseInt(reader.readLine());

            System.out.print("Enter the second integer: ");
            int num2 = Integer.parseInt(reader.readLine());

            // Send the integers to the server
            output.writeInt(num1);
            output.writeInt(num2);
            System.out.println("Sent numbers: " + num1 + " and " + num2);
            // Receive the greatest number from the server
            int greatest = input.readInt();
            System.out.println("The greatest number received from the server is: " + greatest);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
