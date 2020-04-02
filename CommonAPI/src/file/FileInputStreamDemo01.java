package file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\日常笔记\\a.txt");
        int len = 0;
        /*while((len =fis.read()) != -1){
            System.out.println((char)len);
        }*/
        byte [] bytes = new byte[2];
        while ((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }
    }
}
