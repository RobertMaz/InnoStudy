import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        final CommonResource commonResource = new CommonResource();
        final Lock reentrantLock = new ReentrantLock();

        for (int i = 0; i < 10; i++) {
            final Thread thread = new Thread(new CountThread(commonResource, reentrantLock));
            thread.setName("name_" + i);
            thread.start();
        }
    }

    private static class CommonResource {
        int value = 0;

    }

    private static class CountThread implements Runnable {
        private final CommonResource resource;
        private final Lock lock;

        public CountThread(CommonResource resource, Lock lock) {
            this.resource = resource;
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock();
            try {
                resource.value = 1;
                for (int i = 1; i < 5; i++) {
                    System.out.printf("name=%s id=%d\n", Thread.currentThread().getName(), i);
                    resource.value++;
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
