package org.example.first_unit.note_book.dto;

/**
 * Класс Record представляет одну запись в блокноте.
 * Содержит текст записи.
 */
public class Record {
    private String record;

    /**
     * Метод создает новую запись с заданным содержанием.
     *
     * @param record   текст записи
     */
    public Record(String record) {
        this.record = record;
    }

    /**
     * Метод возвращает текст записи.
     */
    public String getRecord() {
        return record;
    }

    /**
     * Метод используется для редактирования записи в блокноте
     *
     * @param newRecord   новый текст записи
     */
    public void editRecord(Record newRecord) {
        System.out.println("-----------------------------");
        System.out.printf("SYSTEM: Изменение записи на: %s%n", newRecord.getRecord());
        this.record = newRecord.getRecord();
        System.out.println("SYSTEM: Запись изменена");
        System.out.println("-----------------------------");

    }
}
