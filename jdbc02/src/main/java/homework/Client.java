package homework;


import java.io.IOException;
import java.net.Socket;

public class Client {

    private Socket socket;

    /*
        初始化客户端
     */
    public Client(){
        try {
            System.out.println("正在连接客户端");
            socket = new Socket("localhost",8088);
            System.out.println("连接客户端");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
        客户端开始工作的方法
     */
    public void start(){

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
