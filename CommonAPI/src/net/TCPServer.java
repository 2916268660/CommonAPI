package net;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
1、客户端创建ServerSocket对象使用accept拿到Socket对象
    构造方法：
        ServerSocket(int port) 创建绑定到特定端口的服务器套接字。
    相关方法：
        Socket accept()侦听并接受到此套接字的连接。
2、使用 getOutputStream()方法，拿到字节输出流，然后用write方法向客户端返回数据
3、然后使用  getInputStream()方法，拿到字节输入流，使用read方法读取客户端向服务器提交的数据
4、关闭流
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1、客户端创建ServerSocket对象使用accept拿到Socket对象
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        byte [] bytes = new byte[10];
        int len = 0;
        /*read函数是一个阻塞式的函数，从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
         以整数形式返回实际读取的字节数。在输入数据可用、检测到文件末尾或者抛出异常前，此方法一直阻塞。
         解决办法：
            1、能一次读完的时候就不要用while循环读取。
            2、或者设置跳出循环的条件，即len<=by.length。
            3、可以使用监听机制，监听输入流中有有效数据时再读取。
            4、设置超时时间
         */
        while((len = is.read(bytes))!= -1){
            System.out.print(new String(bytes,0,len));
            if(len<bytes.length){
                break;
            }
        }
        OutputStream os = socket.getOutputStream();
        os.write("我很好，你呢?".getBytes());
        socket.close();
        serverSocket.close();
    }
}
