package ArrayListWordCounter;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;


public class ArrayListWordCounter {

    public static void main(String[] args) {
        System.out.println("The Word Counter application\n");
        Words words = new Words("c:/temp/king-james.txt");
        words.print();      
    }
}
