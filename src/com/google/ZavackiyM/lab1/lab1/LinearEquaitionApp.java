package com.google.ZavackiyM.lab1.lab1;

import java.util.Scanner;

/**
 * Created by Марк on 24.09.2015.
 */
public class LinearEquaitionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Введіть a:");
        a = Double.parseDouble(scanner.nextLine());

        System.out.print("Введіть b:");
        b = Double.parseDouble(scanner.nextLine());

        System.out.println(-b / a);


    }
}
