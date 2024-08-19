/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joe.mapwordcounter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author joefo
 */
public class Words {
    Map<String,Integer> words = new TreeMap<>();
    int numberWords = 0;

    public Words(String filename) {
        
        try {
            String buffer;

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
                    buffer = buffer.replace(";", "");  // remove periods
                    buffer = buffer.replace(":", "");  // remove periods
                    buffer = buffer.replace(")", "");  // remove periods
                    buffer = buffer.replace("(", "");  // remove periods
                    buffer = buffer.toLowerCase();     // convert to lower case

                    // split the string into an array
                    String[] line = buffer.split(" ");

                    // define a map and fill it with words and their counts
                    for (String word : line) {
                        numberWords ++;
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
        } catch (IOException e) {
            System.out.println("Input file does not exist\n");
        }
    }
    
    public void print() {
    // print the entries
    for (Map.Entry entry : words.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    System.out.println("Total number of words = " + numberWords);

    }  
}