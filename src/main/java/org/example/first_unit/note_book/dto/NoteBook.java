package org.example.first_unit.note_book.dto;

import java.util.Objects;

public class NoteBook {
    private int DEFAULT_NOTEBOOK_SIZE = 10;
    private Record[] records;

    /**
     * Конструктор для инициализации нового объекта типа NoteBook
     * с переданным массивом записей типом Record
     *
     * @param initialRecords   Массив записей типа Record[]
     */
    public NoteBook(Record[] initialRecords) {
        this.records = initialRecords;
    }

    /**
     * Конструктор для инициализации нового объекта типа NoteBook
     * инициализируется массив с дефолтным размером DEFAULT_NOTEBOOK_SIZE = 100
     */
    public NoteBook() {
        this.records = new Record[DEFAULT_NOTEBOOK_SIZE];
    }

    /**
     * Метод используется для добавления записи в блокнот.
     *
     * @param i   индекс новой записи в блокноте
     * @param record   запись, которую нужно добавить в блокнот
     */
    public void addNewRecord(int i, Record record) {
        records[i]=record;
    }

    /**
     * Метод используется для получения всех записей блокнота.
     */
    public Record[] getAllNoteBookRecordsFromNoteBook() {
        return this.records;
    }

    /**
     * Метод используется для очищения переданного блокнота.
     */
    public void cleanNoteBook() {
        for (Record record : this.records) {
            record = null;
        }
    }

    /**
     * Метод используется для вывода в консоль всех записей переданного блокнота.
     */
    public void printAllRecordsInNoteBook() {
        for (int i = 0; i < records.length - 1; i++) {
            if (Objects.isNull(records[i])){
                return;
            }
            System.out.printf("Запись №%d: %s%n", i+1, records[i].getRecord());
        }
    }
}
