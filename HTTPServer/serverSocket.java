package HTTPServer;

import java.io.*;
import java.net.*;

public class serverSocket {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader;
        OutputStreamWriter outputStreamWriter;
        BufferedReader buffR;
        BufferedWriter buffW;

        ServerSocket server = new ServerSocket(8080);
        Socket clientSocket;

        while (true) {
            try {
                System.out.println("Server: Listening for a client" +
                        "...");
                clientSocket = server.accept();
                System.out.println("Server: Found a client Server");

                // writing and reading to server
                inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
                outputStreamWriter = new OutputStreamWriter((clientSocket.getOutputStream()));

                // putting the input and output into the buffered
                buffR = new BufferedReader(inputStreamReader);
                buffW = new BufferedWriter(outputStreamWriter);


                buffW.write("Pick your option:" +
                        "1. Ping local host/n 2. Ping google/n 3.");
                buffW.newLine();
                buffW.flush();

                InetAddress address;

                while (true) {

                    // read the input from the user
                    String message = buffR.readLine();
                    System.out.println("Client: " + message);
                    
                        switch (message) {
                              //pinging local host
                              case "1":
                                  String localHost = "127.0.0.1";
                                  address = InetAddress.getByName(localHost);
                                  if(address.isReachable(2000)){
                                      System.out.println("Hello from local host");
                                  } else {
                                      System.out.println("Local host is unreachable");
                                  }
                                  break;
                                  // get google ip address
                              case "2":
                                  address = InetAddress.getByName("www.google.com");
                                  System.out.println("Website name: " + address.getHostName());
                                  System.out.println("Website address: " + address.getHostAddress());
                                 break;
                              case "3":
                                  break;
                              case "4":
                                  buffW.write("Server: Goodbye");
                                  buffW.newLine();
                                  buffW.flush();
                                  break;
                             default:
                                throw new IllegalArgumentException("Invalid input " + message);
                        }

                    System.out.println("Server: Closing Server");
                    clientSocket.close();
                    inputStreamReader.close();
                    outputStreamWriter.close();
                    buffR.close();
                    buffW.close();
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}