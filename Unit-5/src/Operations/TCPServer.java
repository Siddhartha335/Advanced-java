package Operations;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        // Define the port number to listen to
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is waiting for client connection...");

            // Accept client connection
            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connected.");

                // Create input and output streams to communicate with the client
                DataInputStream input = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

                // Read two integers from the client
                int num1 = input.readInt();
                int num2 = input.readInt();
                System.out.println("Received numbers: " + num1 + " and " + num2);

                // Determine the greatest number
                int greatest = Math.max(num1, num2);

                // Send the greatest number back to the client
                output.writeInt(greatest);
                System.out.println("Sent the greatest number: " + greatest);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
