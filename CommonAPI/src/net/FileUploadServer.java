package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while(true){
            Socket s = ss.accept();
            new Thread(() ->{
                try {
                    String filename = "ws"+System.currentTimeMillis()+new Random().nextInt(9999)+".txt";
                    InputStream is = s.getInputStream();
                    File file = new File("D:\\日常笔记\\HHH");
                    if(!file.exists()){
                        file.mkdirs();
                    }
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while((len = is.read(bytes))!=-1){
                        FileOutputStream fos = new FileOutputStream(file+"\\"+filename);
                        fos.write(bytes,0,len);
                    }
                    OutputStream os = s.getOutputStream();
                    os.write("上传成功！".getBytes());
                    s.close();
                    //服务器不用关闭了
                    //ss.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
