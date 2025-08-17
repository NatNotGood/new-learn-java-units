package org.example.first_unit;

public class SecondExerciseFirstUnitClass {
    public static void calculationTangentFunction(double a, double b, double h) {
        if (h <= 0 || a > b) {
            System.out.println("Ошибка: шаг должен быть положительным, а a <= b");
            return;
        }

        System.out.println("\nТаблица значений функции F(x) = tg(2x) - 3");
        System.out.printf("%10s | %20s\n", "x", "F(x)");
        System.out.println("-------------------------------");

        for (double x = a; x <= b; x += h) {
            double fx;
            try {
                fx = Math.tan(2 * x) - 3;
                System.out.printf("%10.4f | %20.10f\n", x, fx);
            } catch (Exception e) {
                System.out.printf("%10.4f | %20s\n", x, "Ошибка вычисления");
            }
        }
    }
}
