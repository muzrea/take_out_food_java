package main.model;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Items {
    private String id;
    private String name;
    private double price;

    public Items(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId(String id) {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public static void main(String[] args){
        List<String> list = getPromotionItems();
        for(String i:list){
            System.out.println(i);
        }
    }

    public static List<Items> getAllItems() {
        Items item1 = new Items("ITEM0001", "黄焖鸡", 18.00);
        Items item2 = new Items("ITEM0013", "肉夹馍", 6.00);
        Items item3 = new Items("ITEM0022", "凉皮", 8.00);
        Items item4 = new Items("ITEM0030", "冰锋", 2.00);
        List<Items> allItems = new ArrayList<Items>();
        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);
        allItems.add(item4);
        return allItems;
    }

    public static List<String> getPromotionItems() {
        String[] str = new String[]{"ITEM0001", "ITEM0022"};
        List<String> myPomotions = Arrays.asList(str);
        return myPomotions;
    }
}
