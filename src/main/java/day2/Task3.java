package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            int u = a;
            while (u <= b) {
                if (u % 5 == 0 && !(u % 10 == 0)) {
                    System.out.print(u + " ");

                }
                u++;
            }

        }

    }
}