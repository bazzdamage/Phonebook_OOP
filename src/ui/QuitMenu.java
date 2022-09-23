package ui;

public class QuitMenu extends MenuItem{
    @Override
    public void showMenuContent() {
        System.out.println("Thanks for using this program");
        System.out.println("(c) bazzdamage 2022");
        System.exit(0);
    }
}
