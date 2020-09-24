import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class Main {
    public static void main(String[] args){
        //TODO - create a LinkedList to store the spam keywords
        LinkedList<String> list = new LinkedList<>();


        try{
            //Open the input file
            File file = new File("SampleSpam.txt");
            Scanner words = new Scanner(file);

            //loop over the input file
            while(words.hasNext()){
                //TODO - add the words to a LinkedList; disregard case
                list.addFrequent(words.next().toLowerCase());
            }

            //TODO - print the LinkedList


            list.print();


        }catch(IOException e){
            System.out.println("File not found!");
        }



    }
}
