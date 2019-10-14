package task1_1;


import java.util.List;

public class TextFile {

    public void printDirectory(Directory directory) {
        List<File> files = directory.getFiles();
        for (int i = 0; i < files.size(); i++) {
            File w = files.get(i);
            String str = w.getFile();
            System.out.println(str);
        }
    }




}
