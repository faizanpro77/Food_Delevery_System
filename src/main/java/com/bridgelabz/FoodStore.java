package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class FoodStore {
    public Set<FoodItem> foodList = new HashSet<>();
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
        foodList.add(foodItem);
    }

    public void deleteItem(String item) {
        foodList.stream().filter(s -> s.getFoodName().equalsIgnoreCase(item)).findFirst().map(s-> {
                    foodList.remove(s);
                    return s;
                });
    }

    public void printStarterItems() {
           foodList.stream().filter(s1 -> s1.getFoodCategory().equals(FoodCategory.STARTER)).forEach(System.out::println);
    }

    public void printMainCourseItems() {
        foodList.stream().filter(s -> s.getFoodCategory().equals(FoodCategory.MAIN_COURSE)).forEach(System.out::println);

    }

    public void printJuiceItem() {
        foodList.stream().filter(s -> s.getFoodCategory().equals(FoodCategory.JUICE)).forEach(System.out::println);
    }

    public void printIceCreamItem() {
        foodList.stream().filter(s -> s.getFoodCategory().equals(FoodCategory.ICE_CREAM)).forEach(System.out::println);
    }

    public void printAllItem() {
        for (FoodItem foodItem : foodList) {
            System.out.println("prepare item : " + foodItem);
        }
    }

    public void printDeliveredItem() {
         foodList.stream().forEach(System.out::println);
}

    @Override
    public String toString() {
        return "FoodStore{" +
                "foodStore=" + foodList +
                '}';
    }
}

