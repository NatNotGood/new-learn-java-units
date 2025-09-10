package org.example.second_unit.additional_exercises;

public class Child extends Parent{

//    в таком случае - ошибка компиляции. У родительского класса нет конструктора без параметров. Чтобы исправить, нужно явно вызвать конструктор с аргументами родителя
//    Child() {
//        System.out.println("Child(): конструктор без аргументов");
//    }

    public Child() {
        super("Messege from Child");
        System.out.println("Child(): constructor with arguments");
    }
}
