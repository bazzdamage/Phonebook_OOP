package backend;

import java.util.ArrayList;

public class Phonebook {
    ArrayList<Record> phonebook = new ArrayList<>();

    public Phonebook() {
    }

    public void AddRecord(Record record) {
        phonebook.add(record);
    }

    public ArrayList<Record> getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(ArrayList<Record> phonebook) {
        this.phonebook = phonebook;
    }
}
