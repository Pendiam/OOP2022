package db;

import java.util.Map;
import java.util.Properties;

public class EnvMap {
    public static void main(String[] args) {
        System.out.println("-----------System Environment ---------------------");


        Map<String, String> OSenv = System.getenv();

        for (String envName : OSenv.keySet()) {
            System.out.format("%s=%s%n", envName, OSenv.get(envName));
        }

        System.out.println("-----------JVM Environment ---------------------");

        Properties jvm = System.getProperties();
        jvm.list(System.out);


        String workingDir = System.getProperty("user.dir");

        System.out.println(workingDir);
    }
}
