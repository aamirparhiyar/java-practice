package socketprogramming;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 12345); // Connect to the server
        
        // Create input and output streams for communication
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        
        // Create a separate thread to read messages from the server
        Thread readThread = new Thread(() -> {
            String serverInput;
            try {
                while ((serverInput = in.readLine()) != null) {
                    System.out.println("Server: " + serverInput);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        readThread.start();
        
        // Read user input and send it to the server
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = consoleInput.readLine()) != null) {
            out.println(userInput);
        }
        
        // Close the connections
        in.close();
        out.close();
        consoleInput.close();
        clientSocket.close();
    }
}

