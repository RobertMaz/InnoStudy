package Store;

public class man {
    private static final Object lock2 = new Object();
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        final Thread thread1 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                }
            }
        });
        thread1.setDaemon(true);
        thread1.start();
    }
}
