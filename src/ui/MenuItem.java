package ui;

import enums.Command;

public abstract class MenuItem {
    String header;
    Command[] commands;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Command[] getCommands() {
        return commands;
    }

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }

    public void showMenuItem () {
        ClrScrForIdea.ClrScr();
        showMenuHeader();
        showMenuContent();
        showMenuFooter();
    }

    private void showMenuHeader() {
        System.out.printf("----- %s -----\n", header);
    }

    private void showMenuFooter() {
        System.out.println("----- commands -----");
        for (Command command : commands) {
            command.printCommand();
        }
    }

    public abstract void showMenuContent();
}

