import java.io.*;
import java.util.*;

public class FinderParagraph {
    int space = 0;


    int spaceTo=0;

    int tockka=0;

    StringBuffer newstr = new StringBuffer();
    Map<String,Integer> par = new HashMap<>();
    File file = new File("gText.txt");
    Scanner scanner;


    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void findAmountOfParagraph() {
        int parag = 0;int spaceT = 0;
        while (scanner.hasNextLine()) {
            char[] symbols = scanner.nextLine().toCharArray();
            for (int i = 0; i < symbols.length; i++) {
                if (symbols[i] == ' ') {
                    spaceT++;
                } else spaceT = 0;

                if (spaceT == 4) {
                    parag++;

                }
            }
        }
        System.out.println(parag);
    }


    public void findMyWayToDie(){
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        String[] strings = stringBuilder.toString().split("    ");

        for (int i = 1;i < strings.length;i++){
            par.put(strings[i], countDots(strings[i]));
        }

        par.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

    public int countDots(String s){
        int dotsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!'){
                dotsCount++;
            }
        }
        return dotsCount;
    }
}
