package org.example.first_unit;

public class FourthExerciseFirstUnitClass {
    public static void quadraticEquationSolver(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Это не квадратное уравнение (a не должно быть 0)");
        } else {
            double discriminant = b * b - 4 * a * c;
            System.out.println("Дискриминант: " + discriminant);

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Уравнение имеет два корня:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println("Уравнение имеет один корень:");
                System.out.println("x = " + x);
            } else {
                System.out.println("Уравнение не имеет действительных корней");
            }
        }
    }
}
