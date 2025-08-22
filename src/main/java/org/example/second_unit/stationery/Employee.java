package org.example.second_unit.stationery;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Stationery> supplies = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public void addSupply(Stationery item) {
        supplies.add(item);
    }

    public double getTotalSuppliesCost() {
        double total = 0.0;
        for (Stationery item : supplies) {
            total += item.getCost();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee other = (Employee) o;
        return java.util.Objects.equals(name, other.name) &&
                java.util.Objects.equals(supplies, other.supplies);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, supplies);
    }

    @Override
    public String toString() {
        return "Employee: name='" + name + "', supplies='" + supplies + "'";
    }
}
