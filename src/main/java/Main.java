import org.example.first_unit.note_book.MainNoteBookClass;

import java.util.Scanner;

import static org.example.first_unit.FirstExerciseFirstUnitClass.*;
import static org.example.first_unit.FourthExerciseFirstUnitClass.quadraticEquationSolver;
import static org.example.first_unit.SecondExerciseFirstUnitClass.calculationTangentFunction;
import static org.example.first_unit.ThirdExerciseFirstUnitClass.getMaxAndMinInTwoDimensionalArray;

public class Main {
    public static void main(String[] args) {
        arrayWithForLoopOnly();
        arrayWithWhileLoop();
        arrayWithDoWhileLoop();
        getMaxAndMinInTwoDimensionalArray();

        Scanner scannerSecondExercise = new Scanner(System.in);
        System.out.print("Введите коэффициент x: ");
        double x = scannerSecondExercise.nextDouble();

        System.out.print("Введите коэффициент y: ");
        double y = scannerSecondExercise.nextDouble();

        System.out.print("Введите коэффициент h: ");
        double h = scannerSecondExercise.nextDouble();
        calculationTangentFunction(x, y, h);

        Scanner scannerFourhExercise = new Scanner(System.in);
        System.out.print("Введите коэффициент x1: ");
        double a = scannerFourhExercise.nextDouble();

        System.out.print("Введите коэффициент x2: ");
        double b = scannerFourhExercise.nextDouble();

        System.out.print("Введите коэффициент x3: ");
        double c = scannerFourhExercise.nextDouble();
        quadraticEquationSolver(a, b, c);

        MainNoteBookClass mainNoteBookClass = new MainNoteBookClass();
        mainNoteBookClass.initMethod();

    }
}