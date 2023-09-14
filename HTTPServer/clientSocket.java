package HTTPServer;

import java.io.*;
import java.net.*;
import java.util.*;


public class clientSocket {

    public static void main(String[] args) throws IOException {
        // read in data
        // different method to printing data
        // DataInputStream
        // PrintWriter
        InputStreamReader inputStreamReader = null;
        // output data
        OutputStreamWriter outputStreamWriter = null;
        // read the whole data instead of one character
        // flush the buffer when it is full
        BufferedReader buffR = null;
        BufferedWriter buffW = null;
        Socket clientSocket = null;

        try {
            // binding the client socket to the local host ip and port number
            clientSocket = new Socket("localhost", 8080);

            // writing and reading to server
            inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
            outputStreamWriter = new OutputStreamWriter((clientSocket.getOutputStream()));

            // putting the input and output into the buffered
            buffR = new BufferedReader(inputStreamReader);
            buffW = new BufferedWriter(outputStreamWriter);

            Scanner input = new Scanner(System.in);

            while(true) {
                // keep looping this
                // need a way to asked if user want to keep going or quit
                // maybe another while loop
                System.out.println("Server: " + buffR.readLine());
                String readMessage = input.nextLine();

                buffW.write(readMessage);
                buffW.newLine();
                buffW.flush();



                if(readMessage.equalsIgnoreCase("4")){
                    break;
                }
            }


        } catch(Exception e){
            System.out.println("Error finding server");
        } finally {
            try {
                // to avoid a null expectation error we have to check
                // for null values
                if (clientSocket != null) {
                    clientSocket.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (outputStreamWriter != null) {
                    outputStreamWriter.close();
                }
                if (buffR != null) {
                    buffR.close();
                }
                if (buffW != null) {
                    buffW.close();
                }
            }
            catch (NullPointerException n) {
                System.out.println("Null Pointer Exception encountered");
            }

        }

        }

}

