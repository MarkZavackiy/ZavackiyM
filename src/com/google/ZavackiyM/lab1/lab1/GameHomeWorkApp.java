package com.google.ZavackiyM.lab1.lab1;

import com.sun.media.jfxmedia.events.MarkerEvent;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Марк on 29.09.2015.
 */
public class GameHomeWorkApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(101);
        int response;
        response = 13;


        System.out.println("Ви загадали число?");
        {
            System.out.println(Math.abs(randomNumber));
            System.out.println("Можливо це число є вірним?");


            while (true) {
                response = Integer.parseInt(scanner.nextLine());
                if (response < randomNumber) {
                    System.out.println("моє число більше");
                } else if (response > randomNumber) {
                    System.out.println("моє число менше");
                } else {
                    System.out.println("я відгадав!!!");
                    return;


                }


            }
        }
    }
}