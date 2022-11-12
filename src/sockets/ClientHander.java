package sockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHander implements Runnable {

    public static ArrayList<ClientHander> clientHanders = new ArrayList<>();
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;

    public ClientHander(Socket socket) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientUsername = bufferedReader.readLine();
            clientHanders.add(this);
            broadcastMessage("SERVER: " + clientUsername + " has entered the chart!");
        } catch (IOException e) {
            closeEverthing(socket, bufferedReader, bufferedWriter);
        }
    }

    @Override
    public void run() {
        while (socket.isConnected()) {
            try {
                String clientMessage = bufferedReader.readLine();
                if (clientMessage != null)
                    broadcastMessage(clientMessage);
            } catch (IOException e) {
                closeEverthing(socket, bufferedReader, bufferedWriter);
                break;
            }
        }
    }

    public void broadcastMessage(String messageToSend) {
        for (ClientHander clientHander : clientHanders) {
            try {
                if (!clientHander.clientUsername.equals(clientUsername)) {
                    clientHander.bufferedWriter.write(messageToSend);
                    clientHander.bufferedWriter.newLine();
                    clientHander.bufferedWriter.flush();
                }
            } catch (IOException e) {
                closeEverthing(socket, bufferedReader, bufferedWriter);
            }
        }
    }

    public void removeClientHandler() {
        clientHanders.remove(this);
        broadcastMessage("SERVER: " + clientUsername + " has left the chart!");

    }

    public void closeEverthing(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        removeClientHandler();
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedReader.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
