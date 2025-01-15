package needed.utils.gens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class NameGen{

    // Метод для получения случайного имени из файла
    public static String getRandomNameFromFile(String filePath) {

        Random random = new Random();

        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line.trim());
            }
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
            return null; // В случае ошибки возвращаем null
        }

        if (names.isEmpty()) return null; // Если список пуст, возвращаем null


        return names.get(random.nextInt(names.size())); // Генерируем случайное имя
    }
}
