package backend;

import java.util.ArrayList;
import java.util.List;

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
