package threads;

public class PrintThread extends Thread {
    String name;

    public PrintThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                sleep(3000);
            } catch (InterruptedException ie) {
                System.err.println("Thread interupted.");
                ie.printStackTrace();
            }

            System.out.println(name);
        }
    }
}
