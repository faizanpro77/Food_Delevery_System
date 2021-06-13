package com.bridgelabz;

import java.util.ArrayList;

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

    public void deleteItem(String item) {
        for (int i = 0; i < foodStore.size(); i++) {
            String matcher = foodStore.get(i).getFoodName();
            if (matcher.equalsIgnoreCase(item)) {
                foodStore.remove(i);
                System.out.println("Item removed Successfuly");
            } else {
                System.out.println("Name Not Found");
            }
        }
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

