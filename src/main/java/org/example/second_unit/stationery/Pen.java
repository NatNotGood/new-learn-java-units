package org.example.second_unit.stationery;

import java.util.Objects;

public class Pen extends Stationery {
    private String color;
    public Pen(String name, double cost, String color) {
        super(name, cost);
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color);
    }
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hashCode(color);
    }
    @Override
    public String toString() {
        return String.format("Pen: name='%s', cost='%s', color='%s'", getName(), getCost(), color);
    }
}
