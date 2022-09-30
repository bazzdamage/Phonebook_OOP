package ui;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    String output = "";

    public String UserInputGet() {
        return scanner.nextLine();
    }
}
