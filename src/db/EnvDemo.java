package db;

public class EnvDemo {
    public static void main(String[] args) {
        System.out.println("DB_PASS: " + Env.get("DB_PASS"));
        
    }
}
