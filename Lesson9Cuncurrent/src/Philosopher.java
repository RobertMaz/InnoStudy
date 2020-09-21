import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private final Semaphore semaphore;
    private int food = 0;
    private String name = "";

    public Philosopher(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (food < 5) {
                System.out.printf("F %s comes\n", name);
                semaphore.acquire();
                System.out.printf("F %s sit into stol\n", name);
                Thread.sleep(1000);
                food++;
                System.out.printf("F %s go will think\n", name);
                semaphore.release();
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.printf("Phylosophy is tired %s\n", name);
        }

    }
}
