public class MultiThread implements Runnable{
    private final String name;

    public MultiThread(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("name=%s cnt=%d\n", name, i);
        }
    }
}
