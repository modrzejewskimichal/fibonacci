package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ktora liczbe z ciagu chcesz poznac?");
        Scanner wej = new Scanner(System.in);
        int a = wej.nextInt();
        int b = 1, c = 1;
        int e, i;

        for (i = 2; i <= a; i++) {
            e = b;
            b = c;
            c = c + e;
        }
        System.out.println(b);
        // write your code here
    }
}