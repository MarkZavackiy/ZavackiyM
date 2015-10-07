package com.google.ZavackiyM.lab1.lab1;

import java.util.Scanner;

/**
 * Created by Марк on 24.09.2015.
 */
public class SymaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedit pershe chislo:");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Vvedit druge chislo");
        int b = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for(int i = a; i <= b; i++){
            // i++ можна писати і тут ... замість "в дужках"
            sum = sum +i;
            // sum += i;  можна і так ...
        }
    }

}
