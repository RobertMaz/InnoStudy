package Store;

public class Supplier implements Runnable{

    private final Store store;

    public Supplier(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.sellGoods();
    }
}
