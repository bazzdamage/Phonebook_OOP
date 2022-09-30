package ui;

import backend.Phonebook;
import enums.Command;

public class ViewerNext extends MenuItem{
    public ViewerNext(Viewer viewer) {

        header = "next index...";
        viewer.increaseIndex();
        commands = new Command[] {Command.VIEW};
    }

    @Override
    public void showMenuContent() {

    }
}
