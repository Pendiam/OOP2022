package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Env {
    static final String filePath = new File(".env").getAbsolutePath();
    public static String get(String key) {

        Properties env = new Properties();
        try {
            env.load(new FileInputStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return env.getProperty(key);

    }

   

}
