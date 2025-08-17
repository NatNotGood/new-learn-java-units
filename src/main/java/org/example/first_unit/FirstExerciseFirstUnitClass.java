package org.example.first_unit;

public class FirstExerciseFirstUnitClass {
    final static int ARRAY_SIZE = 10;
    static int[] numbers = new int[ARRAY_SIZE];

    public static void arrayWithForLoopOnly() {
        System.out.println("Результат выполнения кода с циклом for");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 2;
        }

        System.out.print("Исходный массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] *= numbers[i - 1];
        }

        System.out.print("После обработки: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void arrayWithWhileLoop() {
        int k = 0;
        System.out.println("Результат выполнения кода с циклом while");
        while (k < numbers.length) {
            numbers[k] = (k + 1) * 2;
            k++;
        }

        System.out.print("Исходный массив: ");
        k = 0;
        while (k < numbers.length) {
            System.out.print(numbers[k] + " ");
            k++;
        }

        k = 1;
        while (k < numbers.length) {
            numbers[k] *= numbers[k - 1];
            k += 2;
        }
        System.out.println();

        System.out.print("После обработки: ");
        k = 0;
        while (k < numbers.length) {
            System.out.print(numbers[k] + " ");
            k++;
        }
        System.out.println();
        System.out.println();
    }

    public static void arrayWithDoWhileLoop() {
        int j = 0;
        System.out.println("Результат выполнения кода с циклом do-while");
        do {
            numbers[j] = (j + 1) * 2;
            j++;
        } while (j < numbers.length);

        System.out.print("Исходный массив: ");
        j = 0;
        do {
            System.out.print(numbers[j] + " ");
            j++;
        } while (j < numbers.length);
        System.out.println();

        j = 1;
        do {
            numbers[j] *= numbers[j - 1];
            j += 2;
        } while (j < numbers.length);

        System.out.print("После обработки: ");
        j = 0;
        do {
            System.out.print(numbers[j] + " ");
            j++;
        } while (j < numbers.length);
        System.out.println();
    }
}