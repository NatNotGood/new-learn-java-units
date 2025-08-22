package org.example.second_unit.stationery;

public class Notebook extends Stationery{
    private int pages;
    public Notebook(String name, double cost, int pages) {
        super(name, cost);
        this.pages = pages;
    }
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        Notebook nb = (Notebook) o;
        return pages == nb.pages;
    }
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Integer.hashCode(pages);
    }
    @Override
    public String toString() {
        return "Notebook: name='" + getName() + "', cost=" + getCost() + ", pages=" + pages + "";
    }
}
