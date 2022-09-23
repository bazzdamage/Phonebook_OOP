package ui;

import enums.Command;

import java.util.HashMap;
import java.util.Map;

public class MenuBuilder {
    MainMenu mainMenu = new MainMenu();
    Help help = new Help();
    QuitMenu quitMenu = new QuitMenu();
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
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public Help getHelp() {
        return help;
    }
}
