public class MyThread implements Runnable {
    private final Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("start: " +
                Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            counter.add(1);
        }
        System.out.println("finish: " + Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return "MyThread{" +
                "counter=" + counter +
                '}';
    }
}
