import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        Path toFile = Paths.get("calories.txt").toAbsolutePath();
        String data = Files.readString(toFile);
        ArrayList<Integer> elvesTotals = new ArrayList<Integer>();

        String[] elves = data.split("\n\r");

        for (int i = 0; i < elves.length; i++)
        {
            Integer total = 0;
            String[] elfItems = elves[i].split("\n");

            for (int j = 0; j < elfItems.length; j++)
            {
                if (elfItems[j] == "")
                    total += 0;
                else
                    total += Integer.parseInt(elfItems[j].trim());
            }
            elvesTotals.add(total);
        }

        System.out.println(Collections.max(elvesTotals));

    }
}