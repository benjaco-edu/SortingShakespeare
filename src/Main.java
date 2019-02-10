import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    List<String> originalList = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.readFileToArray();


        String[] stockArr = main.originalList.toArray(new String[main.originalList.size()]);

        //TIMING!

        //NOTE!!! Due to the length of the .txt-file, we are only printing the first 20 words to show that they are sorted!

        //Timing the Selection Sorted Array
        String[] unsortedOne = stockArr.clone();
        main.printArray(unsortedOne);
        System.out.println("Selection Sorted Array: " +Helpers.timeExecution(() ->SortingAlgorithm.SelectionSort(unsortedOne)));
        main.printArray(unsortedOne);

        System.out.println("--------------------------------");

        //Timing the Insertion Sorted Array
        String[] unsortedTwo = stockArr.clone();
        main.printArray(unsortedTwo);
        System.out.println("Intsertion Sorted Array: " +Helpers.timeExecution(() ->SortingAlgorithm.InsertionSort(unsortedTwo)));
        main.printArray(unsortedTwo);

        System.out.println("--------------------------------");

        //Timing the Merge (Bottom up) Sorted Array
        String[] unsortedThree = stockArr.clone();
        main.printArray(unsortedThree);
        System.out.println("Merge (Bottom Up) Sorted Array: " +Helpers.timeExecution(() ->SortingAlgorithm.MergeSortBottomUp(unsortedThree)));
        main.printArray(unsortedTwo);

        System.out.println("--------------------------------");

        System.out.println("--- ! Done ! ---");




    }

    //Function to ReadFile
    //While reading the file and putting it into an ArrayList, ALL words are put into lowercase
    //Also removes all symbols etc. leaving only alphabetic characters.
    public void readFileToArray() throws IOException {

        Scanner s = new Scanner(new File("./src/shakespear.txt"));
        //Scanner s = new Scanner(new File("./src/Shaky.txt"));

        while (s.hasNext()){
            String word = s.next().toLowerCase().replaceAll("[^a-z]","");
            if(word.isBlank()){
                continue;
            }
            originalList.add(word);
        }

        s.close();

    }


    public void printArray(String[] strArray){
        for(int i = 0; i<20;i++){
            System.out.print(strArray[i] + " ");
        }
        System.out.println("");
       // System.out.println(String.join(" ", strArray));
    }




}

