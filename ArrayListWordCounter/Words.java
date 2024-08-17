package ArrayListWordCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Words {
    ArrayList<Word> words;
    
    public Words(String filename) {
        words = new ArrayList<>();
        try {
            String buffer;
            int numberWords = 0;

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
                    String[] line = buffer.split(" ");

                    // define a map and fill it with words and their counts
                    for (String word : line) {
                        numberWords++;
                        if (wordMap.containsKey(word)) {        // word is in map
                            int oldCount = wordMap.get(word);
                            int newCount = oldCount + 1;
                            wordMap.put(word, newCount);
                        } else {                                // new word for map
                            wordMap.put(word, 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Input file does not exist\n");
        }
    }
    
    public int find(String word) {
        for 
    }
    
}
