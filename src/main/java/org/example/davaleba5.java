package org.example;

import java.util.Scanner;

public class davaleba5 {
    public static boolean hasTeen(int n1, int n2, int n3) {
        return (n1 >= 13 && n1 <= 19) || (n2 >= 13 && n2 <= 19) || (n3 >= 13 && n3 <= 19);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ჩაწერე პირველი რიცხვი:");
        int number1 = scanner.nextInt();
        System.out.println("ჩაწერე მეორე რიცხვი:");
        int number2 = scanner.nextInt();
        System.out.println("ჩაწერე მესამე რიცხვი:");
        int number3 = scanner.nextInt();
        if (hasTeen(number1, number2, number3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}