package org.example.second_unit.additional_exercises;

public class MultifunctionDevice implements Scanner, Printer{
    private String name;

    public MultifunctionDevice() {
        System.out.println("Многофункциональное устройство создано");
        this.name = "Многофункциональное устройство";
    }

    public MultifunctionDevice(String name) {
        System.out.printf("Многофункциональное устройство %s создано", name);
        this.name = name;
    }

    /*
    Одна реализация метода в классе удовлетворяет сразу обоим интерфейсам
    При вызове через разные интерфейсные ссылки всё равно используется один и тот же метод у объекта.
     */
    @Override
    public void print() {
        System.out.println("Печать и сканирование через одно устройство");
    }

    /*
    При одинаковых дефолтных методах нужно явно указывать реализацию нужного интерфейса
     */
    @Override
    public void startPrint() {
        Scanner.super.startPrint();
        Printer.super.startPrint();
    }
}
