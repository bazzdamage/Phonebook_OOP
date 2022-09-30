package ui;

import backend.FileReader;
import backend.Phonebook;
import enums.Command;

public class Viewer extends MenuItem {

    Phonebook phonebook;
    int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public void increaseIndex() {
        index++;
    }
    public void decreaseIndex() {
        index--;
    }

    public Viewer(Phonebook phonebook) {
        this.phonebook = phonebook;
        header = "Phonebook Viewer";
        commands = new Command[]{Command.NEXT, Command.PREVIOUS, Command.ADD, Command.QUIT, Command.HELP};
    }

    @Override
    public void showMenuContent() {
        var temp = phonebook.getPhonebook();
        if (temp.size() <= index) {
            System.out.println("Phonebook has no records...");
        } else System.out.println(temp.get(index));
    }
}
