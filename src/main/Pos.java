package main;

import java.util.List;
import java.util.Optional;

public class Pos {
    private Cart cart;
    private List<Item> reducedItemList;

    public Pos(Cart cart) {
        this.cart = cart;
    }

    public void reduceItemInCart() {
        List<Item> itemList = cart.getItems();

        itemList.forEach(item -> {
            Item finedItem = getItem(item.getBarcode());
            if (finedItem == null) {
                reducedItemList.add(item);
            } else {
                finedItem.addOneItem();
            }
        });
    }

    public double calculateTotalPrice() {
        double sum = 0;

        for (Item item : reducedItemList) {
            sum += item.calculateTotalPrice();
        }

        return sum;
    }

    private Item getItem(String barcode) {
        Optional<Item> item = reducedItemList.stream().filter(i -> i.getBarcode().equals(barcode)).findFirst();
        return item.orElse(null);
    }

    public String printreceipt() {
        reduceItemInCart();
        String itemsString = "";
        reducedItemList.forEach(item -> itemsString.concat(item.printItem()));

        return "***<没钱赚商店>收据***\n" +
                itemsString +
                "----------------------\n" +
                "总计：" + calculateTotalPrice() + "（元）\n" +
                "**********************";
    }

}
