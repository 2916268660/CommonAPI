package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\日常笔记\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(97);
        bos.close();

    }
}
