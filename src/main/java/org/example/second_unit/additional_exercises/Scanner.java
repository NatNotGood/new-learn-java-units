package org.example.second_unit.additional_exercises;

public interface Scanner {
    void print();
    default void startPrint() {
        System.out.println("Scanner is starting...");
    }
}
