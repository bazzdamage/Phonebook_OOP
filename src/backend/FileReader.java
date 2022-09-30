package backend;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    List<Record> records;
    List<String> input = new ArrayList<>();

    public FileReader(Phonebook phonebook) {
        this.records = phonebook.getPhonebook();
    }

    public void LoadState() {
        List<String> temp = new ArrayList<>();
        int emptyLines = 0;
        try {
            input = Files.readAllLines(Paths.get("src\\temp\\temp.txt"));
            for (String s : input) {
                if (s.equals("")) {
                    emptyLines++;
                    temp.add(s);
                    if (emptyLines == 2) {
                        records.add(new Record(temp));
                        temp.clear();
                    }
                } else temp.add(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
