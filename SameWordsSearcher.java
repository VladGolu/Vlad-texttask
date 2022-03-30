import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SameWordsSearcher {

    private static Scanner scanner = null;

    static {
        try {
            scanner = new Scanner(new File("gText.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void findSameWords(){
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        String str = stringBuilder.toString();
        str = str.replaceAll("    ", "");
        String[] strings = str.split(" ");
        System.out.println(Arrays.stream(strings).toList().stream().collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum)));

    }

    public static void main(String[] args) {
        findSameWords();
    }


}
