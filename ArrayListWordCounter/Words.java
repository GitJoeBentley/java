package ArrayListWordCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Words {
    ArrayList<Word> words;
    int numberWords = 0;

    public Words(String filename) {
        words = new ArrayList<>();
        
        try {
            String buffer;
            int index;

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
                        this.numberWords++;
                        index = find(word);
                        if (index != -1) {        // word is in map
                            words.get(index).incrementCount();
                        } else {                                // new word for map
                            words.add(new Word(word));
                            numberWords++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Input file does not exist\n");
        }
    }
    
    public int find(String word) {
        int index = 0;
        for (Word w : this.words) {
            if (w.getWord().equals(word)) {
                return index;
            }        
            index++;
        }
        return -1;
    }
    
    public void print() {
        for (Word w : this.words) {
            System.out.println(w.getWord() + "  " + w.getCount());
        }
        System.out.println("Number of words = " + this.numberWords);
    }
    
}
