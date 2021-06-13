package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodStore {
    public ArrayList<FoodItem> foodStore = new ArrayList<>();
    static FoodStore instance;

    private  FoodStore() {
    }

    static synchronized FoodStore getInstance() {
        if(instance == null){
            instance = new FoodStore();
        }
        return instance;
    }

    public void addItem(FoodItem foodItem) {
        foodStore.add(foodItem);
    }

    public void deleteItem(FoodItem foodItem) {
        foodStore.remove(foodItem);
    }

    public void printStarterItems() {
        for(FoodItem fooditem : foodStore) {
            if(fooditem.getFoodCategory() == (FoodCategory.STARTER)) {
                System.out.println(fooditem);
            }
        }
    }

    public void printMainCourseItems() {
        for (FoodItem fooditem : foodStore) {
            if (fooditem.getFoodCategory() == (FoodCategory.MAIN_COURSE)) {
                System.out.println(fooditem);
            }
        }
    }

    public void printJuiceItem() {
        for (FoodItem foodItem : foodStore) {
            if(foodItem.getFoodCategory() == (FoodCategory.JUICE) ) {
                System.out.println(foodItem);
            }
        }
    }

    public void printIceCreamItem() {
        for (FoodItem foodItem : foodStore) {
            if(foodItem.getFoodCategory() == (FoodCategory.ICE_CREAM)) {
                System.out.println(foodItem);
            }
        }
    }

    public void printPreparedItem() {
        for (FoodItem foodItem : foodStore) {
            System.out.println("prepare item : " + foodItem);
        }
    }

    public void printDeliveredItem() {
        for (FoodItem foodItem : foodStore) {
            System.out.println(foodItem);
        }
    }

    @Override
    public String toString() {
        return "FoodStore{" +
                "foodStore=" + foodStore +
                '}';
    }
}

