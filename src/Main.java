import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder Log = new StringBuilder();

// создаем объект File в качестве каталога
        File dirSrc = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src");
        if (dirSrc.mkdir())
            System.out.println("Каталог src создан");
        Log.append("Каталог src создан");
        Log.append('\n');

        File dirRes = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res");
        if (dirRes.mkdir())
            System.out.println("Каталог res создан");
        Log.append("Каталог res создан");
        Log.append('\n');

        File dirSavegames = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\savegames");
        if (dirSavegames.mkdir())
            System.out.println("Каталог savegames создан");
        Log.append("Каталог savegames создан");
        Log.append('\n');

        File dirTemp = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\temp");
        if (dirTemp.mkdir())
            System.out.println("Каталог temp создан");
        Log.append("Каталог temp создан");
        Log.append('\n');

        File dirMain = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\main");
        if (dirMain.mkdir())
            System.out.println("Каталог main создан");
        Log.append("Каталог main создан");
        Log.append('\n');

        File dirTest = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\test");
        if (dirTest.mkdir())
            System.out.println("Каталог test создан");
        Log.append("Каталог test создан");
        Log.append('\n');

        // создаем объект File для файла, находящегося в каталоге
        File fileMain = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\main", "Main.java");
        // создадим новый файл
        try {
            if (fileMain.createNewFile())
                System.out.println("Файл Main.java был создан");
            Log.append("Файл Main.java был создан");
            Log.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // создаем объект File для файла, находящегося в каталоге
        File fileUtils = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\src\\main", "Utils.java");
        // создадим новый файл
        try {
            if (fileUtils.createNewFile())
                System.out.println("Файл Utils.java был создан");
            Log.append("Файл Utils.java был создан");
            Log.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dirDrawables = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res\\drawables");
        if (dirDrawables.mkdir())
            System.out.println("Каталог drawables создан");
        Log.append("Каталог drawables создан");
        Log.append('\n');

        File dirVectors = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res\\vectors");
        if (dirVectors.mkdir())
            System.out.println("Каталог vectors создан");
        Log.append("Каталог vectors создан");
        Log.append('\n');

        File dirIcons = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\res\\icons");
        if (dirIcons.mkdir())
            System.out.println("Каталог icons создан");
        Log.append("Каталог icons создан");
        Log.append('\n');

        // создаем объект File для файла, находящегося в каталоге
        File fileTemp = new File("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\temp", "temp.txt");
        // создадим новый файл
        try {
            if (fileTemp.createNewFile())
                System.out.println("Файл temp.txt был создан");
            Log.append("Файл temp.txt был создан");
            Log.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        String text = Log.toString();

        try (FileWriter writer = new FileWriter("C:\\Алексей\\Программирование\\JAVA Нетология\\Java Core\\HW Installation\\Games\\temp\\temp.txt", false)) {

            writer.write(text);

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
