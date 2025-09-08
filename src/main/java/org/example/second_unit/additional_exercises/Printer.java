package org.example.second_unit.additional_exercises;

public interface Printer {
    void print();
    default void startPrint() {
        System.out.println("Printer is starting...");
    }
}
