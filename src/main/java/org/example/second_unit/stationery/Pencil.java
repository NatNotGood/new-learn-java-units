package org.example.second_unit.stationery;

import java.util.Objects;

public class Pencil extends Stationery{
    private String hardness;
    public Pencil(String name, double cost, String hardness) {
        super(name, cost);
        this.hardness = hardness;
    }
    @Override
    public boolean equals(Object o) {
        //вызовется метод equals суперкласса, который по умоллчанию сравнивает ссылки на объекты
//        if (!super.equals(o)) return false;
        //явное сравнение классов. Если классы не равны, то объекты не равны
        if (getClass() != o.getClass()) return false;
        Pencil pencil = (Pencil) o;
        return Objects.equals(hardness, pencil.hardness);
    }
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hashCode(hardness);
    }
    @Override
    public String toString() {
        return String.format("Pencil: name='%s', cost='%s', hardness='%s'", getName(), getCost(), hardness);
    }
}
