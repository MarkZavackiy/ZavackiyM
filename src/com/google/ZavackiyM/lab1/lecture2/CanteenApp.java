package com.google.ZavackiyM.lab1.lecture2;

/**
 * Created by Марк on 07.10.2015.
 */
public class CanteenApp {

    public static void main(String[] args) {

        Food[] set = new Food[5];
        set[0] = new Food("Бульйон", 10, 500);
        set[1] = new Food("Борщ", 12, 500);
        set[2] = new Food("Пюре", 15, 400);
        set[3] = new Food("Відбивна", 20, 350);
        set[4] = new Food("Вареники", 17, 450);

        for(int i = 0; i < set.length; i++ ){
            System.out.println(set[i]);

        }


    }
}
