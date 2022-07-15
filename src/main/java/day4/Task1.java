package day4;

import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
Scanner i = new Scanner(System.in);
int n = i.nextInt();
int[] numbers = new int[n];
Random rand = new Random();

for (int a=0; a<numbers.length; a++){
    numbers[a] = rand.nextInt(10);
}
for (int a:numbers){
    System.out.print(a + " ");
}
int bolsh = 0;
for (int y:numbers){
    if (y>8){
        bolsh = bolsh + 1;
    }
}
        int ravno = 0;
        for (int z:numbers){
            if (z==1){
                ravno = ravno + 1;
            }
        }
        int chet = 0;
        for (int c:numbers){
            if (c%2==0){
                chet = chet + 1;
            }
        }
        int nechet = 0;
        for (int q:numbers){
            if (q%2==1){
                nechet = nechet + 1;
            }
        }
        System.out.println();
int sum = 0;
for (int x:numbers){
    sum=sum+x;
}
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8:" + " " + bolsh);
        System.out.println("Количество чисел равных 1:" + " " + ravno);
        System.out.println("Количество четных чисел" + " " + chet);
        System.out.println("Количество нечетных чисел" + " " + nechet);
        System.out.println("Сумма всех элементов массива" + " " + sum);
    }
}
