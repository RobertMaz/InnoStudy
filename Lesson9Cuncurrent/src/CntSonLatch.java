import java.util.concurrent.CountDownLatch;

public class CntSonLatch {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(5);
        System.out.println("start");
        new Thread(new MyThread(countDownLatch)).start();
        new Thread(new MyThread(countDownLatch)).start();
        countDownLatch.await();
        System.out.println("finish");
    }
    private static class MyThread implements Runnable{
        private final CountDownLatch latch;

        public MyThread(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.printf("name=%s, i=%d\n", Thread.currentThread().getName(), i);
                latch.countDown();
            }
        }
    }
}
