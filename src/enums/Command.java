package enums;

import java.util.HashMap;
import java.util.Map;

public enum Command {


    MENU('m'),
    HELP('h'),
    QUIT('q'),
    VIEW('v'),
    ADD('a'),
    EDIT('e'),
    REMOVE('r'),
    NEXT('n'),
    PREVIOUS('p');

    private static final Map<Character, Command> LOOKUP_MAP;
    private final Character shortcut;

    static {
        LOOKUP_MAP = new HashMap<>();
        for (Command command : Command.values()) {
            LOOKUP_MAP.put(command.getShortcut(), command);
        }
    }
    Command(Character shortcut) {
        this.shortcut = shortcut;
    }

    public Character getShortcut() {
        return shortcut;
    }

    public static Command retrieveByShortcut (Character ch) {
        return LOOKUP_MAP.get(ch);
    }

    public void printCommand () {
        System.out.print(this.name() + " [" + this.getShortcut() + "] | ");
    }
}
