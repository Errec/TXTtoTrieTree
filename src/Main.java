import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        TrieSET set = new TrieSET();

        String file = "src/words.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                set.add(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for (String key : set){
            System.out.println(key);
        }

        for (String s : set.keysThatMatch("puzzler")) {
            System.out.println("\nword " + s + " found");
        }
    }
}
