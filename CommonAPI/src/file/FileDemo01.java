package file;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("D:\\日常笔记");
        String s = file.toString();
        System.out.println(s);
        query(file);

    }
    public static void query(File f){
        File[] files = f.listFiles();
        for(File f1:files){
            if(f1.isDirectory()){
                query(f1);
            }else {
                System.out.println(f1);
            }
        }
    }
}
