package main.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Order {
    private Map<String,Integer> orderMap;
    public Order(Map<String,Integer> orderMap){
        this.orderMap = orderMap;
    }
    public void setOrderMap(Map<String,Integer> orderMap){
        this.orderMap = orderMap;
    }
    public Map<String,Integer> getOrderMap(){
        return this.orderMap;
    }
    public double getTotal(ArrayList<Items> allItems){
        double total = 0;
        for(Map.Entry entry : orderMap.entrySet()){
            for(Items element : allItems){
                if(element.getId() == entry.getKey()){
                    total += entry.getValue()*element.getPrice();
                }
            }
        }
        return total;
    }
}
