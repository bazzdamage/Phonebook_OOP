package backend;

import enums.Command;
import ui.MenuItem;

import java.util.Scanner;

public class CommandProcessor {
    Scanner input = new Scanner(System.in);
    Character user = ' ';
    boolean isStringNumber = true;
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
            user = input.nextLine().toLowerCase().charAt(0);


            if (checkCommand(user)) {
                return Command.retrieveByShortcut(user);
            } else System.out.println("Command is not recognized");
        }
    }
}
