package net;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
1、客户端创建socket对象连接到服务器
    构造方法：
        Socket(String host, int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
        host：可以是主机的用户名或者是ip地址    port：设置一个端口号
    相关方法：
        OutputStream getOutputStream()  返回此套接字的输出流。
        InputStream getInputStream()  返回此套接字的输入流。
2、使用 getOutputStream()方法，拿到字节输出流，然后用write方法向服务器提交数据
3、然后使用  getInputStream()方法，拿到字节输入流，使用read方法读取服务器向客户端返回的数据
4、关闭流
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1、客户端创建socket对象连接到服务器
        Socket socket = new Socket("localhost",8888);
        //2、使用 getOutputStream()方法，拿到字节输出流，然后用write方法向服务器提交数据
        OutputStream os = socket.getOutputStream();
        os.write("你好啊，宋楠".getBytes());
        //3、然后使用  getInputStream()方法，拿到字节输入流，使用read方法读取服务器向客户端返回的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //4、关闭流
        socket.close();

    }
}
