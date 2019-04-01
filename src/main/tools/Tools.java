package main.tools;

import main.model.Items;

import java.util.*;

public class Tools {
    public static void main(String[] args){
        Map<String,Integer> inputMap = processInput("ITEM0001 x 1,ITEM0013 x 2,ITEM0022 x 1");
        Set set = inputMap.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry mentry = (Map.Entry)it.next();
            System.out.println(mentry.getKey());
            System.out.println(mentry.getValue());
        }
    }

    public static Map<String,Integer> processInput(String input){
        Map<String,Integer> inputMap = new HashMap<String, Integer>();
        String[] inputArray = input.split("[|,|]");
        List<String> inputList = Arrays.asList(inputArray);
        for(String i:inputList){
            String[] inputElement = i.split(" x ");
            System.out.println(i);
            inputMap.put(inputElement[0],Integer.valueOf(inputElement[1].trim()));
        }
        return inputMap;
    }

    public static double getDiscount(Map<String,Integer> orderMap,ArrayList<Items> allItems, ArrayList<String> promotionItems){
        double discount = 0;
        for(Map.Entry entry : orderMap.entrySet()){
            for(Items element : allItems){
                if((Items)element.getId() == entry.getKey()&&promotionItems.contains(entry.getKey())){
                    discount += (Items)element.getValue()/2*element.getPrice();
                }
            }
        }
        return discount;
    }
    public static double minusSixDiscount(double total){
        return total-6;
    }

}
