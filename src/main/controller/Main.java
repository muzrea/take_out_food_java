package main.controller;

import main.model.Items;
import main.tools.Tools;
import main.model.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        inputOutput();
    }

    public static void inputOutput() {
        System.out.println("please input your order : ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        try {
            String inputText = br.readLine();
            Map<String, Integer> inputMap;
            inputMap = Tools.processInput(inputText);
            Order myorder = new Order(inputMap);
            double OrderTotal = 0;
            if (myorder.getTotal() >= 30) {
                double promotionDiscount = getDiscount(myorder.getOrderMap(), Items.getAllItems(), Items.getPromotionItems());
                if (promotionDiscount > 6) {
                    OrderTotal = myorder.getTotal() - promotionDiscount;
                } else {
                    OrderTotal = myorder.getTotal() - 6;
                }
            } else {
                OrderTotal = myorder.getTotal() - 6;
            }
            System.out.println("============= 订餐明细 =============");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
