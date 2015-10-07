package com.google.ZavackiyM.lab1.lab1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Марк on 29.09.2015.
 */
public class GameApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(101);
         // ціле у проміжку [0, 101), тобто [0, 100]
        int response;

        System.out.println("Я задумав число від 1 до 100, вгадай його");

        // Повторювати вічно. Вихід із програми закладений всередині циклу (return)
        // Зчитати введений рядок із консолі і розпізнати в ньому ціле число
        while (true) {
            response = Integer.parseInt(scanner.nextLine());

            if (response < randomNumber) {
                System.out.println("Ні, спробуйте більше число");
            } else if (response > randomNumber){
            System.out.println("Ні, спробуйте менше число");
        } else {
            System.out.println("Ви відгадали!!!");
            // return - вийти із методу main, а відтак і з програми
            return;

            }


            }


    }
}
