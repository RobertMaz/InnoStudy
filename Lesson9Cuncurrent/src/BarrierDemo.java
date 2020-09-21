import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Action());
        new Thread(new MyClass(cyclicBarrier, "First")).start();
        new Thread(new MyClass(cyclicBarrier, "Second")).start();
        new Thread(new MyClass(cyclicBarrier, "Three")).start();
        new Thread(new MyClass(cyclicBarrier, "4")).start();
    }

    private static class MyClass implements Runnable {
        private final CyclicBarrier barrier;
        private final String name;

        public MyClass(CyclicBarrier barrier, String name) {
            this.barrier = barrier;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.printf("start %s\n", name);
                barrier.await();
                System.out.printf("finish %s\n", name);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
    private static class Action implements Runnable{

        @Override
        public void run() {
            System.out.println("Happy");
        }
    }
}
