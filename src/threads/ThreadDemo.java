package threads;

public class ThreadDemo {
    public static void main(String args[]) {
        PrintThread a = new PrintThread("Thread 1");
        PrintThread b = new PrintThread("Thread 2");

        a.setPriority(10);
        b.setPriority(2);

        a.setDaemon(true);
        

        a.start();
        b.start();

        System.out.println("Thread a's Priority is: " + a.getPriority());
        System.out.println("Thread b's Priority is: " + b.getPriority());
        System.out.println("Is thread a deamon?: " + a.isDaemon());
        System.out.println("Is thread b deamon?: " + b.isDaemon());

    }

}