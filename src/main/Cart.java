package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private List<Item> items;

    public Cart(List<String> items) {
        this.items = items.stream()
                .map(Item::convertStringToItem)
                .collect(Collectors.toList());
    }

    public List<Item> getItems() {
        return items;
    }
}
