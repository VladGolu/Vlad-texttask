import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextAnalysis {

    FinderParagraph finderParagraph = new FinderParagraph();
    FinderBigWord finderBigWord=new FinderBigWord();


    File file = new File("gText.txt") ;
    Scanner scanner;

    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public void textAnalysis(){
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        //finderParagraph.findAmountOfParagraph();

        finderParagraph.findMyWayToDie();
        finderBigWord.findBigWord();


        scanner.close();
    }
}
