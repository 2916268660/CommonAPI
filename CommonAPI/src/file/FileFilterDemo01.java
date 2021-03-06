package file;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo01 {
    public static void main(String[] args) {
        File file = new File("D:\\日常笔记");
        query(file);

    }
    public static void query(File f){
        File[] files = f.listFiles( (pathname) -> pathname.getName().toLowerCase().endsWith(".java") );
        for(File file:files){
            if(file.isDirectory()){
                query(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
