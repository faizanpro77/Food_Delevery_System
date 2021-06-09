package com.bridgelabz;

public class Application {

    public static void main(String[] args) {

        FoodStore foodStore = new FoodStore();

        System.out.println("-------------------------Welcome to the food delivery System----------------------------");

        PaneerTikka paneerTikka = new PaneerTikka();
        paneerTikka.setPrice(150);
        paneerTikka.setTaste(Taste.SPICY);

        VadaPav vadaPav = new VadaPav();
        vadaPav.setPrice(20);
        vadaPav.setTaste(Taste.SALTY);

        TandooriChicken tandooriChicken = new TandooriChicken();
        tandooriChicken.setPrice(230);
        tandooriChicken.setTaste(Taste.SPICY);

        DalFry dalFry = new DalFry();
        dalFry.setPrice(120);
        dalFry.setTaste(Taste.SWEET);

        MasalaPapad masalaPapad = new MasalaPapad();
        masalaPapad.setPrice(35);
        masalaPapad.setTaste(Taste.SALTY);

        Drink drink = new Drink();
        drink.setPrice(100);
        drink.setTaste(Taste.SWEET);


        // adding the foods items
        foodStore.prepare(paneerTikka);
        foodStore.prepare(vadaPav);
        foodStore.prepare(tandooriChicken);
        foodStore.prepare(dalFry);
        foodStore.prepare(masalaPapad);
        foodStore.prepare(drink);
//        //printing the food items
//        foodStore.printFood();
//
//        // delivering the food items
//        foodStore.deliver(paneerTikka);
//
//        System.out.println("Food Items after Delivery -------------------------------------------------------");
//
//        //printing food items after delivering
//        foodStore.printFood();
        foodStore.createSystemMenu();

    }

}
