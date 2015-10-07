package com.google.ZavackiyM.lab1.practic;

import java.util.Scanner;

/**
 * Created by Марк on 01.10.2015.
 */
public class LabOneApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int sum = 0;

        int sumEven = 0;
        int sumOdd = 0;
        int i;

        for (i = a; i <= b; i++){
            System.out.println(i);

            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }else{
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("Сума парних чисел:" + sumEven);
        System.out.println("Сума непарних чисел" + sumOdd);
    }
}
