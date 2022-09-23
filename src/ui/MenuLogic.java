package ui;

import backend.CommandProcessor;
import enums.Command;

import java.util.HashMap;
import java.util.Map;

public class MenuLogic {

    public MenuLogic() {
        MenuBuilder mb = new MenuBuilder();
        mb.makeDefinitions();
        mb.getMainMenu().showMenuItem();
        CommandProcessor cp = new CommandProcessor(mb.getMainMenu());

        while (true) {
            MenuItem cur = mb.getMenuItem(cp.commandHandler());
            cur.showMenuItem();
            cp.setCommands(cur.getCommands());
        }
    }
}
