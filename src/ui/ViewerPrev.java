package ui;

import backend.Phonebook;
import enums.Command;

public class ViewerPrev extends MenuItem{
    public ViewerPrev(Viewer viewer) {
        header = "prev index...";
        viewer.decreaseIndex();
        commands = new Command[] {Command.VIEW};
    }

    @Override
    public void showMenuContent() {

    }
}
