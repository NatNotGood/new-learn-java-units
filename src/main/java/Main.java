import org.example.second_unit.additional_exercises.*;
import org.example.second_unit.messenger.*;
import org.example.second_unit.stationery.Notebook;
import org.example.second_unit.stationery.Pen;
import org.example.second_unit.stationery.Pencil;
import org.example.second_unit.stationery.Stationery;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        arrayWithForLoopOnly();
//        arrayWithWhileLoop();
//        arrayWithDoWhileLoop();
//        getMaxAndMinInTwoDimensionalArray();
//
//        Scanner scannerSecondExercise = new Scanner(System.in);
//        System.out.print("Введите коэффициент x: ");
//        double x = scannerSecondExercise.nextDouble();
//
//        System.out.print("Введите коэффициент y: ");
//        double y = scannerSecondExercise.nextDouble();
//
//        System.out.print("Введите коэффициент h: ");
//        double h = scannerSecondExercise.nextDouble();
//        calculationTangentFunction(x, y, h);
//
//        Scanner scannerFourhExercise = new Scanner(System.in);
//        System.out.print("Введите коэффициент x1: ");
//        double a = scannerFourhExercise.nextDouble();
//
//        System.out.print("Введите коэффициент x2: ");
//        double b = scannerFourhExercise.nextDouble();
//
//        System.out.print("Введите коэффициент x3: ");
//        double c = scannerFourhExercise.nextDouble();
//        quadraticEquationSolver(a, b, c);
//
//        MainNoteBookClass mainNoteBookClass = new MainNoteBookClass();
//        mainNoteBookClass.initMethod();


//        Stationery item1 = new Stationery("Ручка", 10.5);
//        Stationery item2 = new Stationery("Карандаш", 5.0);
//        Stationery item3 = new Stationery("Блокнот", 20.0);
//        Stationery item4 = new Stationery("Подставка для канцелярских товаров", 40);
//        Stationery item5 = new Stationery("Стикеры", 15L);
//        Stationery item6 = new Stationery("Степлер", 20D);
//        Employee employee = new Employee("Иван Иванов");
//        employee.addSupply(item1);
//        employee.addSupply(item2);
//        employee.addSupply(item3);
//        employee.addSupply(item4);
//        employee.addSupply(item5);
//        employee.addSupply(item6);
//        System.out.println(employee);
//        System.out.println("Общая стоимость: " + employee.getTotalSuppliesCost());


//        Stationery[] beginnersSet = {
//                new Pen("Ручка", 10.5, "синяя"),
//                new Pencil("Карандаш", 5.0, "HB"),
//                new Notebook("Блокнот", 20.0, 100)
//        };
//        System.out.printf("Набор новичка: %s%n%n", Arrays.toString(beginnersSet));
//        double total = 0.0;
//        for (Stationery item : beginnersSet) {
//            total += item.getCost();
//        }
//        System.out.printf("Общая стоимость набора: %s%n%n", total);
//
//        MessengerService messenger = new TelegramMessenger();
//        ClientMessenger user = new ClientMessenger(messenger);
//        user.sendMessage("Привет, че кого");
//        user.readMessages();
//
//        user.setMessenger(new WhatsAppMessenger());
//        user.sendMessage("Хочу поговорить");
//        user.readMessages();
//
//        user.setMessenger(new ViberMessenger());
//        user.sendMessage("Хочу поговорить еще раз");
//        user.readMessages();

//        Scanner scanner = new MultifunctionDevice();
//        scanner.print();
//        Printer printer = new MultifunctionDevice();
//        printer.print();
//
//        Pen bluePen = new Pen("Ручка", 10.5, "синяя");
//        Pen redPen = new Pen("Ручка", 10.5, "красная");
//        Pencil hbPencil = new Pencil("Карандаш", 5.0, "HB");
//        Pencil h1Pencil = new Pencil("Карандаш", 8.0, "H1");
//        boolean res1 = bluePen.equals(redPen);
//        boolean res2 = hbPencil.equals(h1Pencil);
//        boolean res3 = bluePen.equals(hbPencil);
//
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);

        //вызывается конструктор родителя без параметров, хотя явно в дочернем он не указан. После родительского контруктора вызывается конструктор дочернего.
        new Fax();
        new Child();
    }
}