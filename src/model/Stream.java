package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class Stream {
    public static void getConfig(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) file.createNewFile();
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(file));
            //затычка - чтение из пропертей
            for(String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                System.out.println(key + " => " + value);
            }
        }catch (IOException e){

        }

    }
}
