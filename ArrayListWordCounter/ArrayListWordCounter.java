package ArrayListWordCounter;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;


public class ArrayListWordCounter {

    public static void main(String[] args) {
        System.out.println("The Word Counter application\n");

        // define a string that contains text
        //String text = "To be or not to be, that is the question.";
        String buffer = "";
        //Map<String,Integer> wordMap = new TreeMap<>();
        int numberWords = 0;
        Words words = new Words("c:/temp/king-james.txt");
        words.print();
/*
        try {

            BufferedReader in
                    = new BufferedReader(new FileReader("c:/temp/king-james.txt"));
                    // = new BufferedReader(new FileReader("c:/temp/cat-in-the-hat.txt"));
            in.readLine();  // read and ignore the first line this the teams file

            while ((buffer = in.readLine()) != null) {
                if (buffer.length() < 2) {
                    // skip a blank line
                } else {
                    // process the string
                    buffer = buffer.replace(",", "");  // remove commas
                    buffer = buffer.replace(".", "");  // remove periods
                    buffer = buffer.replace("!", "");  // remove periods
                    buffer = buffer.replace("'", "");  // remove periods
                    buffer = buffer.replace("?", "");  // remove periods
                    buffer = buffer.toLowerCase();     // convert to lower case

                    // split the string into an array
                    String[] wrds = buffer.split(" ");

                    // define a map and fill it with words and their counts
                    for (String word : words) {
                        numberWords ++;
                        if (wordMap.containsKey(word)) {        // word is in map
                            int oldCount = wordMap.get(word);
                            int newCount = oldCount + 1;
                            wordMap.put(word, newCount);
                        } else {                                // new word for map
                            wordMap.put(word, 1);
                        }
   
                }    
            }
        } catch (IOException e) {
            System.out.println("Input file does not exist\n");
        }
*/
        
            

       
    }
}