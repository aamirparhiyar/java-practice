package socketprogramming;

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345); // ServerSocket initialize karo
        
        System.out.println("Server waiting for clients...");
        Socket clientSocket = serverSocket.accept(); // Wait for a client to connect
        
        System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
        
        // Create input and output streams for communication
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        
        // Read messages from the client and print them
        String inputLine;
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Client: " + inputLine);
            
            // Get user input and send it to the client
            System.out.print("Server: ");
            String serverInput = consoleInput.readLine();
            out.println(serverInput);
        }
        
        // Close the connections
        in.close();
        out.close();
        consoleInput.close();
        clientSocket.close();
        serverSocket.close();
    }
}

