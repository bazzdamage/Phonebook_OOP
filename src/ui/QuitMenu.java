package ui;

import backend.FileWriter;
import enums.Command;

public class QuitMenu extends MenuItem{

    FileWriter fileWriter;

    public QuitMenu(FileWriter fileWriter) {
        header = "Bye, dear User";
        this.fileWriter = fileWriter;
    }

    @Override
    public void showMenuContent() {
        System.out.println("Thanks for using this program");
        System.out.println("(c) bazzdamage 2022");
        fileWriter.SaveState();
        System.exit(0);
    }
}
