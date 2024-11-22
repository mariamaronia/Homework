package org.example;

public class davaleba1 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 1, 2};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("მასივში რიცხვი ლუწია");
            } else {
                System.out.println("მასივში არ არის ლუწი რიცხვი");
            }
        }
    }
}