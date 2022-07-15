package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

            for (int k=0; k<5 ;k++) {
                double a = i.nextDouble();
                double b = i.nextDouble();
                double y = a/b;

                if (b == 0){
                    System.out.println("Деление на 0");
                continue;}
                System.out.println(y);

        }
    }
}
