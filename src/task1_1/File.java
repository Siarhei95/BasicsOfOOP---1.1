package task1_1;

public class File {
    private String file;

    public File(String file){
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void delete() {
        StringBuffer sb = new StringBuffer(file);
        sb.delete(5,9);
        System.out.println(sb);
    }

    public void concat(){
        this.file = file.concat("@mail.ru");
        System.out.println(file);
    }

    public void replace(){
        this.file = file.replace(".txt","@mail.ru");
        System.out.println(file);
    }
}

