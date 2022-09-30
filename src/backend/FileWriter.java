package backend;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileWriter {
    ArrayList<Record> records;
    ArrayList<String> output = new ArrayList<>();

    public FileWriter(Phonebook phonebook) {
        this.records = phonebook.getPhonebook();
    }

    public void SaveState() {
        for (Record record : records) {
            output.addAll(record.RecordToFile());
        }
        try {
            Files.write(Paths.get("src\\temp\\temp.txt"), output, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
