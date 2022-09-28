import java.io.File;

public class Main {
    public static void main(String[] args) {
        File papka = new File("D:\\File");
        File[] spisok = papka.listFiles();
        for (File file : spisok) {
            if (file.getName().matches("(.*).jpg")) {
                System.out.println("Путь к файлу:" + file);
                System.out.println("Название файла:" + file.getName());
            }
        }
    }
}
