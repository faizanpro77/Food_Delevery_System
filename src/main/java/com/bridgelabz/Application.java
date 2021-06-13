package com.bridgelabz;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("-------------------------Welcome to the food delivery System----------------------------");
        Application application = new Application();
        application.createSystemMenu();
    }
        public void createSystemMenu() {
            int i = 0;
            while (i == 0) {
                FoodStore foodStore = FoodStore.getInstance();
                System.out.println("---------------------Food Category's--------------------------");
                System.out.println("1.ADD FOOD ITEM");
                System.out.println("2.TO PRINT ALL STARTERS ITEMS");
                System.out.println("3.TO PRINT ALL MAIN COURSE ITEMS");
                System.out.println("4.TO PRINT ALL JUICE ITEMS");
                System.out.println("5.TO PRINT ALL ICE CREAM ITEMS");
                System.out.println("6.TO PRINT ALL PREPARE ITEMS");
                System.out.println("7.TO PRINT ALL DELIVERED ITEMS");
                System.out.println("8.ENTER A FOOD ITEM TO DELETE");
                System.out.println("9.TO EXIT");
                System.out.println("ENTER YOUR CHOICE");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Application application = new Application();
                        application.AddFoodItem();
                        break;
                    case 2:
                        foodStore.printStarterItems();
                        break;
                    case 3:
                        foodStore.printMainCourseItems();
                        break;
                    case 4:
                        foodStore.printJuiceItem();
                        break;
                    case 5:
                        foodStore.printIceCreamItem();
                        break;
                    case 6:
                        foodStore.printPreparedItem();
                        break;
                    case 7:
                        foodStore.printDeliveredItem();
                        break;
                    case 8:
                        String deleteItemFromMenu = scanner.next();
                        foodStore.deleteItem(deleteItemFromMenu);
                        break;
                    case 9:
                        i = 1;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            }
        }

    public void AddFoodItem() {
        FoodStore foodStore = FoodStore.getInstance();
        Scanner scanner = new Scanner(System.in);
        FoodItem foodItem = new FoodItem();
        System.out.println("Enter food name");
        String foodName = scanner.nextLine();
        foodItem.setFoodName(foodName);

        System.out.println("Enter the price");
        float foodPrice = scanner.nextFloat();
        foodItem.setPrice(foodPrice);

        System.out.println("Enter FoodType");
        System.out.println("1.Veg");
        System.out.println("2.NonVeg");
        int choice = scanner.nextInt();
        switch (choice) {
           case  1:
               foodItem.setFoodType(FoodType.VEG);
               break;
           case 2:
               foodItem.setFoodType(FoodType.NON_VEG);
               break;
        }

        System.out.println("Enter the Taste");
        System.out.println("1.SWEET");
        System.out.println("2.LESS_SPICY");
        System.out.println("3.HIGH_SPICY");
        System.out.println("4.SALTY");

        int tasteChoice = scanner.nextInt();
        switch (tasteChoice)
        {
            case 1:
                foodItem.setTaste(Taste.SWEET);
                break;
            case 2:
                foodItem.setTaste(Taste.LESS_SPICY);
                break;
            case 3:
                foodItem.setTaste(Taste.HIGH_SPICY);
                break;
            case 4:
                foodItem.setTaste(Taste.SALTY);
        }

        System.out.println("Enter the food category");
        System.out.println("1.STARTER");
        System.out.println("2.MAIN_COURSE");
        System.out.println("3.JUICE");
        System.out.println("4.ICE_CREAM");

        int foodCatagoryChoice = scanner.nextInt();
        switch (foodCatagoryChoice) {
            case 1:
                foodItem.setFoodCategory(FoodCategory.STARTER);
                break;
            case 2:
                foodItem.setFoodCategory(FoodCategory.MAIN_COURSE);
                break;
            case 3:
                foodItem.setFoodCategory(FoodCategory.JUICE);
                break;
            case 4:
                foodItem.setFoodCategory(FoodCategory.ICE_CREAM);
                break;
        }
        foodStore.addItem(foodItem);
        System.out.println(foodStore);

    }

}
