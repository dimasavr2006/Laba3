package needed.utils.gens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class NameGen{
    public static String getRandomNameFromFile(String filePath) {

        Random random = new Random();

        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        if (names.isEmpty()) return null;

        return names.get(random.nextInt(names.size()));
    }
}
