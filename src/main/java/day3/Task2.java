package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
while (true){
    double a = i.nextDouble();
    double b = i.nextDouble();
    if (b==0)
        break;
    double y = a/b;
    System.out.println(y);

}
    }
}
