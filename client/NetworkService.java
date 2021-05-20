package ru.gb.chat.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by Artem Kropotov on 17.05.2021
 */
public class NetworkService {
    private final String IP_ADDRESS = "localhost";
    private final int PORT = 8189;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    private boolean connection = true;

    public boolean getConnection() {
        return connection;
    }

    public NetworkService() {
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        try {
            out.writeUTF(message);
            if (message.equals("/end")){
                    System.out.println("Отключился");
                    disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMessage() {
        try {
            String msg = in.readUTF();
            if (msg.equals("/end")) {
                disconnect();
            }
            return msg;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    public void disconnect() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        connection = false;
        System.out.println("Отключился");
    }
}
