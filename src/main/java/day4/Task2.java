package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = rand.nextInt(10000);
        }
        int min = numbers[0] + 1;
        for (int z = 0; z < numbers.length; z++) {
            if (numbers[z] < min) {
                min = numbers[z];

            }
        }
        System.out.println("Минимальное число: " + min);
            int max = numbers[0];
            for (int x = 0; x < numbers.length; x++) {
                max = Math.max(max, numbers[x]);

            }
        System.out.println("Максимальное число: " + max);
            int chet = 0;
int sum = 0;
            for (int c : numbers) {
                if (c % 10 == 0) {
                    chet = chet + 1;
                    sum = sum + c;
                }
            }
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Сумма: " + sum);

        }




    }

