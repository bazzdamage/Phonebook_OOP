package ui;

import backend.FileReader;
import backend.FileWriter;
import backend.Phonebook;
import enums.Command;

import java.util.HashMap;
import java.util.Map;

public class MenuBuilder {
    Phonebook phonebook = new Phonebook();
    FileReader fileReader = new FileReader(phonebook);
    FileWriter fileWriter = new FileWriter(phonebook);

    Boot boot = new Boot(fileReader);
    MainMenu mainMenu = new MainMenu();
    Help help = new Help();
    QuitMenu quitMenu = new QuitMenu(fileWriter);
    Viewer viewer = new Viewer(phonebook);
    AddRecord addRecord = new AddRecord(phonebook);
    ViewerNext viewerNext = new ViewerNext(viewer);
    ViewerPrev viewerPrev = new ViewerPrev(viewer);

    Map<Command, MenuItem> definitions = new HashMap<>();

    public MenuBuilder() {
    }


    public Map<Command, MenuItem> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(Map<Command, MenuItem> definitions) {
        this.definitions = definitions;
    }

    public MenuItem getMenuItem (Command command) {
        return definitions.get(command);
    }

    public void makeDefinitions() {
        definitions.put(Command.HELP, help);
        definitions.put(Command.MENU, mainMenu);
        definitions.put(Command.QUIT, quitMenu);
        definitions.put(Command.VIEW, viewer);
        definitions.put(Command.ADD, addRecord);
        definitions.put(Command.NEXT, viewerNext);
        definitions.put(Command.PREVIOUS, viewerPrev);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public Help getHelp() {
        return help;
    }
}
