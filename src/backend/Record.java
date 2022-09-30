package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Record {
    List<Phone> phones = new ArrayList<>();
    List<EMail> emails = new ArrayList<>();
    Person person;

    public Record(Person person) {
        this.person = person;
    }

    public Record(Phone phone) {
        this.phones.add(phone);
        this.person = new Person(phone.getPhone());
    }

    public Record(Phone phone, Person person) {
        this.phones.add(phone);
        this.person = person;
    }

    public Record(Phone phone, EMail email, Person person) {
        this.phones.add(phone);
        this.emails.add(email);
        this.person = person;
    }

    public Record(ArrayList<Phone> phones, ArrayList<EMail> emails, Person person) {
        this.phones.addAll(phones);
        this.emails.addAll(emails);
        this.person = person;
    }

    public Record(List<String> array) {
        this.person = new Person(array.get(0), array.get(1), array.get(2));
        int enterCounter = 0;
        int i = 3;
        for (; i < array.size(); i++) {
            if (!Objects.equals(array.get(i), "")) this.phones.add(new Phone(array.get(i)));
            else {
                i++;
                break;
            }
        }
        for (; i < array.size(); i++) {
            if (!Objects.equals(array.get(i), "")) this.emails.add(new EMail(array.get(i)));
            else {
                break;
            }
        }
    }

    public List<String> RecordToFile() {
        List<String> output = new ArrayList<>();
        output.add(person.name);
        output.add(person.lastName);
        output.add(person.patronymic);
        for (Phone phone : phones) {
            output.add(phone.getPhone());
        }
        output.add("");
        for (EMail eMail : emails) {
            output.add(eMail.getEmail());
        }
        output.add("");

        return output;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Name: \n");
        if (person.name.length() != 0) output.append(person.name);
        if (person.lastName.length() != 0) output.append(" ").append(person.lastName);
        if (person.patronymic.length() != 0) output.append(" ").append(person.patronymic);
        output.append("\nPhones: \n");
        for (Phone phone : phones) {
            output.append(phone.getPhone()).append("\n");
        }
        output.append("Emails: \n");
        for (EMail email : emails) {
            output.append(email.getEmail()).append("\n");
        }
        return output.toString();
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<EMail> getEmails() {
        return emails;
    }

    public void setEmails(List<EMail> emails) {
        this.emails = emails;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
