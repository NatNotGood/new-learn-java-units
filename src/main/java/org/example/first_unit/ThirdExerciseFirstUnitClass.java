package org.example.first_unit;

import java.util.Random;

public class ThirdExerciseFirstUnitClass {
    public static void getMaxAndMinInTwoDimensionalArray() {
        int rows = 5;
        int cols = 8;
        int[][] array5x8 = new int[rows][cols];
        int[][] minMaxArray = new int[rows][2];

        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array5x8[i][j] = rand.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < rows; i++) {
            int min = array5x8[i][0];
            int max = array5x8[i][0];
            for (int j = 1; j < cols; j++) {
                if (array5x8[i][j] < min) min = array5x8[i][j];
                if (array5x8[i][j] > max) max = array5x8[i][j];
            }
            minMaxArray[i][0] = min;
            minMaxArray[i][1] = max;
        }

        System.out.println("Массив 5x8:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array5x8[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nМассив 5x2 (мин, макс):");
        for (int i = 0; i < rows; i++) {
            System.out.println(minMaxArray[i][0] + "\t" + minMaxArray[i][1]);
        }
    }
}
