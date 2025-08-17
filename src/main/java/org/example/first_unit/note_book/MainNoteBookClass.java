package org.example.first_unit.note_book;

import org.example.first_unit.note_book.dto.NoteBook;
import org.example.first_unit.note_book.dto.Record;

public class MainNoteBookClass {

    public void initMethod() {
        System.out.println("Мой первый NoteBook");
        NoteBook myFirstNoteBook = new NoteBook();

        Record firstRecord = new Record("Привет!");
        Record secondRecord = new Record("Ну привет");
        Record thirddRecord = new Record("Я устал");

        myFirstNoteBook.addNewRecord(0, firstRecord);
        myFirstNoteBook.addNewRecord(1, secondRecord);
        myFirstNoteBook.addNewRecord(2, thirddRecord);

        myFirstNoteBook.printAllRecordsInNoteBook();
        secondRecord.editRecord(new Record("Привет, Миш"));
        myFirstNoteBook.printAllRecordsInNoteBook();

        System.out.println("Мой второй NoteBook");

        Record newFirstRecord = new Record("Завтра снова в 8?");
        Record newSecondRecord = new Record("Да, как обычно");
        Record newThirddRecord = new Record("Встречаемся внизу у офиса");

        Record[] records = {newFirstRecord, newSecondRecord, newThirddRecord};
        NoteBook mySecondNoteBook = new NoteBook(records);

        mySecondNoteBook.printAllRecordsInNoteBook();
        newFirstRecord.editRecord(new Record("Завтра снова в 9?"));
        mySecondNoteBook.printAllRecordsInNoteBook();
    }
}
