package backend;

import enums.Command;
import ui.MenuItem;

import java.util.Locale;
import java.util.Scanner;

public class CommandProcessor {
    Scanner input = new Scanner(System.in);
    String temp = "";
    Character user = ' ';
    Command[] commands;

    public CommandProcessor(MenuItem menuItem) {

        commands = menuItem.getCommands();
    }

    public boolean checkCommand(Character ch) {
        for (Command command : commands) {
            if (command.getShortcut() == ch) return true;
        }
        return false;
    }

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }

    public Command commandHandler() {
        while (true) {

            System.out.println("\nType Command from command list above...");
            temp = input.next().toLowerCase();
            if (!temp.equals(" ") && !temp.equals("\n")) {
                user = temp.charAt(0);
            } else System.out.println("Print something...");

            if (checkCommand(user)) {
                return Command.retrieveByShortcut(user);
            } else System.out.println("Command is not recognized");
        }
    }
}
