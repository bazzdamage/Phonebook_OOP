package ui;

import enums.Command;

public class Help extends MenuItem{
    public Help() {
        header = "Help";
        commands = new Command[]{Command.QUIT, Command.MENU};
    }

    @Override
    public void showMenuContent() {
        System.out.println("Information about each command");
    }
}
