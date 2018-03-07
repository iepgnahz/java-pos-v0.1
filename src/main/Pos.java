package main;

import java.util.ArrayList;
import java.util.List;

public class Pos {
    private Cart cart;
    private List<Item> reducedItemList = new ArrayList<>();

    public Pos(Cart cart) {
        this.cart = cart;
    }

    public void reduceItemInCart() {
        List<Item> itemList = cart.getItems();
        if (reducedItemList.size() == 0) {
            reducedItemList.add(itemList.get(0));
            return;
        }

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
        Item item;
        try {
            item = reducedItemList.stream().filter(i -> i.getBarcode().equals(barcode)).findFirst().orElse(null);
        } catch (NullPointerException e) {
            item = null;
        }

        return item;
    }

    public String printReceipt() {
        reduceItemInCart();
        String itemsString = "";
        for (Item item : reducedItemList) {
            itemsString += item.printItem();
        }

        return "***<没钱赚商店>收据***\n" +
                itemsString +
                "----------------------\n" +
                "总计：" + Util.formatNumber(calculateTotalPrice()) + "（元）\n" +
                "**********************";
    }

}
