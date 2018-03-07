package main;

import com.owlike.genson.Genson;

public class Item {
    private String barcode;
    private String name;
    private String unit;
    private double price;
    private int number;

    public Item(String barcode, String name, String unit, double price) {
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.number = 1;
    }

    public Item() {
        this.number = 1;
    }


    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Item(String barcode, String name, String unit, double price, int number) {
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;

        this.price = price;
        this.number = number;
    }

    public void addOneItem() {
        this.number++;
    }

    public String getBarcode() {

        return barcode;
    }

    public double calculateTotalPrice() {
        return number * price;
    }

    public String printItem() {
        return "名称：" + name + ", " +
                "数量：" + number + unit + ", " +
                "单价：" + Util.formatNumber(price) + "（元）" +
                "小计：" + Util.formatNumber(calculateTotalPrice()) + "（元）" +
                '\n';
    }

    public static Item convertStringToItem(String item) {
        return new Genson().deserialize(item, Item.class);
    }
}
