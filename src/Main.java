import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\temp");
        newFile("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\temp", "temp.txt");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\savegames");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\main");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\test");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res\\drawables");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res\\vectors");
        fileDir("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res\\icons");
        newFile("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\main", "Main.java");
        newFile("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\main", "Utils.java");

    }

    static void fileDir(String path) {
        StringBuilder Log = new StringBuilder();
        File dirSrc = new File(path);
        if (dirSrc.mkdir())
            System.out.println("Каталог " + path + " создан");
        Log.append("Каталог " + path + " создан");
        Log.append('\n');

        String text = Log.toString();
        try (FileWriter writer = new FileWriter("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\temp\\temp.txt", true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void newFile(String pathFile, String nameChild) {
        StringBuilder Log = new StringBuilder();
        File fileMain = new File(pathFile, nameChild);
        // создадим новый файл
        try {
            if (fileMain.createNewFile())
                System.out.println("Файл " + nameChild + " был создан");
            Log.append("Файл " + nameChild + " был создан");
            Log.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = Log.toString();
        try (FileWriter writer = new FileWriter("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\temp\\temp.txt", true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
