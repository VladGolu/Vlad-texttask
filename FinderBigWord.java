import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinderBigWord {

    File file = new File("gText.txt");
    Scanner scanner;


    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void findBigWord(){  char bw;
        String nex=null;
        String Bignex= scanner.next();
        while (scanner.hasNext()){
            String d= scanner.next();
            System.out.println(d);
            if (Bignex.length() < d.length()){
                Bignex=d;
            }

            }
        System.out.println(Bignex);

        }

    }

