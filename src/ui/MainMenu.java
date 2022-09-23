package ui;

import enums.Command;

public class MainMenu extends MenuItem {
    public MainMenu() {
        header = "Main Menu";
        commands = new Command[]{Command.QUIT, Command.HELP, Command.VIEW};
    }

    @Override
    public void showMenuContent() {
        System.out.println("Phonebook by bazzdamage");
        System.out.println("Press shortcuts to commands below");
    }
}
