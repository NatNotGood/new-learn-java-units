package org.example.second_unit.stationery;

import java.util.Objects;

public class Stationery {
    private String name;
    private double cost;

    public Stationery(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stationery other)) return false;
        return Double.compare(other.cost, cost) == 0 &&
                Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return String.format("Stationery: name='%s', cost='%s'", name, cost);
    }
}
