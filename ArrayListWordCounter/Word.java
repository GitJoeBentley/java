package ArrayListWordCounter;

public class Word {
    private String word;
    private int count = 0;
    
    public Word(String word) {
        this.word = word;
        this.count = 1;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public String getCount() {
        return this.word;
    }
    
    public void incrementCount() {
        this.count++;
    }
}
