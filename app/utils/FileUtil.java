package utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

    public static final int MAX_SIZE_FOR_BINARY_DETECTION = 512;

    public static void rm_rf(File file){
        if(file.isDirectory()){
            File[] list = file.listFiles();
            for(int i = 0; i < list.length; i++) {
                rm_rf(list[i]);
            }
            file.delete();
        } else {
            file.delete();
        }
    }
}
