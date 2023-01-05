package clean.code.book.comunication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {


    public static void main(String[] args) {

        String host = getHost(args);
        Integer port = getPort(args);


        try (
                Socket echoSocket = new Socket(host, port);
                PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        ) {
            out.println("Hello");
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }


    public static String getHost(String[] args) {
        try {
            return args[0];
        } catch (Exception e) {
            return "localhost";
        }
    }

    public static Integer getPort(String[] args) {
        try {
            return Integer.parseInt(args[1]);
        } catch (Exception e) {
            return 8080;
        }
    }


}
