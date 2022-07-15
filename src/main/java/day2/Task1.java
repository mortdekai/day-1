package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
Scanner i = new Scanner(System.in);
int y  =i.nextInt();
if (y>= 1 && y<=4) {
    System.out.println("Малоэтажный дом");
}
else if (y>= 5 && y<=8){
    System.out.println("Среднеэтажный дом");
}
else if (y >= 9) {
            System.out.println("Многоэтажный дом");
        }
else if (y<=0){
    System.out.println("Ошибка ввода");
}
    }
}
