package net;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileUploadCilent {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\日常笔记\\a.txt");
        Socket socket = new Socket("localhost",8888);
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes) ) != -1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int leng = 0;
        while((leng = is.read(bytes1) ) != -1){
            System.out.println(new String(bytes1,0,leng));
        }
        socket.close();
        fis.close();
    }
}
