package homework;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket server;

    public Server(){
        try {
            System.out.println("正在启动客户端");
            server = new ServerSocket(8088);
            System.out.println("已经启动客户端");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){

        try {
            System.out.println("等待客户端连接");
            Socket socket = server.accept();
            System.out.println("客户端连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
