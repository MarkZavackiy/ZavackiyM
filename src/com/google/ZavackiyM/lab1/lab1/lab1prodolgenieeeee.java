package com.google.ZavackiyM.lab1.lab1;

import java.util.Scanner;

/**
 * Created by Марк on 24.09.2015.
 */
public class lab1prodolgenieeeee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ax2+bx+c
        double a;
        double b;
        double c;

        System.out.print("Vvedit chislo a:");
        a = Double.parseDouble(scanner.nextLine());

        System.out.print("Vvedit chislo b:");
        b = Double.parseDouble(scanner.nextLine());

        System.out.print("Vvedit chilo c:");
        c = Double.parseDouble(scanner.nextLine());

        double d = b*b - 4*a*c;
        double x1 = (-b - Math.sqrt(d)) / (2*a);
        double x2 = (-b + Math.sqrt(d)) / (2*a);

        System.out.println(d);
        System.out.println(x1);
        System.out.println(x2);


    }
}
