package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();

        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);


    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(int item : items){
            System.out.println(item*2);
        }


    }
}