import java.util.Map;

public class Counter {
    private Integer count;

    public Counter(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                '}';
    }

    public Integer getCount() {
        return count;
    }

    void add(Integer value) {
        this.count += value;
        final String format = String.format("name=%s i=%d", Thread.currentThread().getName(), value);
        System.out.println(format);
//        if (count.containsKey(value)) {
//            count.put(value, count.get(value) + 1);
//        } else {
//            count.put(value, 0);
//        }
    }

}
