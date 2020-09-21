import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i <= 5; i++) {
            new Philosopher(semaphore, "Valisily-" + i).start();
        }
    }

}
//    final ExecutorService executorService = Executors.newFixedThreadPool(5);
//
//    Counter counter = new Counter(0);
//    final List<MyThread> myThreads = Arrays.asList(new MyThread(counter),
//            new MyThread(counter),
//            new MyThread(counter),
//            new MyThread(counter),
//            new MyThread(counter),
//            new MyThread(counter),
//            new MyThread(counter)
//    );
//
//        for (MyThread myThread : myThreads) {
//                executorService.execute(myThread);
//                }
//                executorService.shutdown();

