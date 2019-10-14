//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

package task1_1;

public class Main {
    public static void main(String[] args) {
        TextFile text = new TextFile();
        String str1 = "E://SomeSource.";
        String str2 = "Hello.txt";
        File file1 = new File(str1);
        File file2 = new File(str2);
        Directory directory = new Directory();
        directory.add(file1);     //добавить в один файл
        directory.add(file2);     //добавить в один файл
        text.printDirectory(directory);   //вывести на кансоль
        file2.delete();  //удалить в пределе от index start до index end из файла
        file2.concat();  //дополним
        file2.replace(); //переименуем файлы на нужные
    }
}
