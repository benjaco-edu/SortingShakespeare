import javax.swing.*;
import java.math.BigDecimal;
import java.util.Random;

public class Helpers {


    public static double timeExecution(Runnable func){
        long startTime = System.nanoTime();
        func.run();
        long endTime = System.nanoTime();

        return (double)(endTime - startTime) / 1000000;
    }

    static public boolean biggerThan(String a, String b){

        return a.compareTo(b) > 0;
    }

    static public boolean smallerThan(String a, String b){

        return a.compareTo(b) < 0;
    }
}