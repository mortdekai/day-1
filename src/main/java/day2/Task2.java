package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int y = a+1; y >= a && y < b; y++) {
                if (y % 5 == 0 && !(y % 10 == 0)) {
                    System.out.print(y+" ");
                }

            }

        }
    }
}