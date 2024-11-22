package org.example;

import java.util.Scanner;

public class davaleba4 {
    public static void checkNumber(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ჩაწერე რიცხვი");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("თქვენი შეყვანილი რიცხვი 0-ია");
            } else if (number < 0) {
                System.out.println("თქვენი შეყვანილი რიცხვი უარყოფითია");
            } else {
                System.out.println("თქვენი შეყვანილი რიცხვი დადებითია");
            }
        }
    }
}

