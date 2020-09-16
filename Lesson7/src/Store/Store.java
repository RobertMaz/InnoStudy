package Store;

public class Store {
    private int goods = 0;


    public int getGoods() {
        return goods;
    }

    public void fillGoods() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Пополняем : " + ++goods);
        }
    }

    public void sellGoods() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Продаем : " + --goods);
        }
    }


}
