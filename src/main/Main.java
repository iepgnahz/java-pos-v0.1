package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] input = new String[]{
                "{\"barcode\":\"ITEM000000\",\"name\":\"可口可乐\",\"unit\":\"瓶\",\"price\":3.00}",
                "{\"barcode\":\"ITEM000000\",\"name\":\"可口可乐\",\"unit\":\"瓶\",\"price\":3.00}"
        };

        List<String> stringCart = new ArrayList<>(Arrays.asList(input));
        Cart cart = new Cart(stringCart);
        Pos pos = new Pos(cart);

        pos.printreceipt();
    }
}
