package ui;

import backend.*;
import backend.Record;
import enums.Command;

public class AddRecord extends MenuItem {

    Phonebook phonebook;

    public AddRecord(Phonebook phonebook) {
        header = "Add NEW Record";
        commands = new Command[]{Command.MENU, Command.ADD};
        this.phonebook = phonebook;
    }

    @Override
    public void showMenuContent() {

        UserInput userInput = new UserInput();
        System.out.println("Please fill all fields:...");
        System.out.println("Phone number:...");
        Phone phone = new Phone(userInput.UserInputGet());
        System.out.println("Person name:...");
        String name = userInput.UserInputGet();
        System.out.println("Person lastname:...");
        String lastName = userInput.UserInputGet();
        System.out.println("Person patronymic:...");
        String patronymic = userInput.UserInputGet();
        Person person = new Person(name, lastName, patronymic);
        System.out.println("Email:...");
        EMail eMail = new EMail(userInput.UserInputGet());
        Record record = new Record(phone, eMail, person);
        phonebook.AddRecord(record);

    }
}
