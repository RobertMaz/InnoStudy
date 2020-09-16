package Store;

import java.util.concurrent.Callable;

public class Auditor implements Callable<Integer> {

    private final Store store;

    public Auditor(Store store) {
        this.store = store;
    }

    @Override
    public Integer call() throws Exception {


        return store.getGoods();
    }
}
