package task1_1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private List<File> directory = new ArrayList<>();

    public void add(File file) {
        directory.add(file);
    }

    public List<File> getFiles() {
        return directory;
    }
}
