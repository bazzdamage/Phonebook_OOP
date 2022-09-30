package ui;

import backend.FileReader;
import enums.Command;

public class Boot extends MenuItem{
    public Boot(FileReader fileReader) {
        fileReader.LoadState();
    }

    @Override
    public void showMenuContent() {
    }
}
