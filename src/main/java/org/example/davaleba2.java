package org.example;

public class davaleba2 {
    public static void main(String[] args) {
        String z = "Hello world z";
        int i = 0;
        while (i < z.length()) {
            if (z.charAt(i) == 'z') {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
