package joe.mapwordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Map;
import java.util.TreeMap;

public class Words {
    Map<String,Integer> words = new TreeMap<>();

    public Words(String filename) {
        
        try {
            String buffer;

            BufferedReader in
                    = new BufferedReader(new FileReader("c:/temp/king-james.txt"));
            in.readLine();  // read and ignore the first line this the teams file

            while ((buffer = in.readLine()) != null) {
                // skip a blank line
                if (buffer.length() < 2) {
                } else {                    
                    buffer = buffer.toLowerCase();     // convert line to lower case

                    // split the string into an array
                    String[] line = buffer.split(" ");

                    for (String word : line) {
                        // Make sure word contains only alphabetic characters
                        if (MapWordCounter.isStringOnlyAlphabet(word)) {
                            if (words.containsKey(word)) {        // word is in map
                                int oldCount = words.get(word);
                                int newCount = oldCount + 1;
                                words.put(word, newCount);
                            } else {                                // new word for map
                                words.put(word, 1);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Input file does not exist\n");
        }
    }
    
    public void print() {
        for (Map.Entry entry : words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total number of words = " + words.size());
    }  
}
