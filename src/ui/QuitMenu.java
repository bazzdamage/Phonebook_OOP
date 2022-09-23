package ui;

import enums.Command;

public class QuitMenu extends MenuItem{
    public QuitMenu() {
        header = "Bye, dear User";
    }

    @Override
    public void showMenuContent() {
        System.out.println("Thanks for using this program");
        System.out.println("(c) bazzdamage 2022");
        System.exit(0);
    }
}
