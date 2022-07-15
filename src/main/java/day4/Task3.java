package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[12][8];
        Random random = new Random();
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers[a].length; b++) {
                numbers[a][b] = random.nextInt(50);
                System.out.print(numbers[a][b] + " ");
            }
            System.out.println();

        }
int MaxsumInd = 0;
        int Maxsum = 0;
        int sum = 0;
        for (int y = 0; y < numbers.length; y++) {
           for (int x = 0; x<numbers[y].length;x++){
               sum += numbers[y][x];
           }
            if (sum >= Maxsum) {
                Maxsum = sum;
MaxsumInd = y;


            }
            System.out.println("Это сумма " + sum);



        }
        System.out.println(Maxsum);
        System.out.println(MaxsumInd);
    }

    }


