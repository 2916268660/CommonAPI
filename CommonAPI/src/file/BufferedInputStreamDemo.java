package file;

import java.io.*;

public class BufferedInputStreamDemo  {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\日常笔记\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int read = 0;
        long e1 = System.currentTimeMillis();
        while((read = bis.read()) != -1){
            System.out.println(read);
        }
        long e2= System.currentTimeMillis();
        System.out.println(e2-e1);
        bis.close();
        fis.close();
    }
}
