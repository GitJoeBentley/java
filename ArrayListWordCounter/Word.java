package ArrayListWordCounter;

public class Word {
    private String word;
    private int cnt = 0;
    
    public Word(String word) {
        this.word = word;
        this.cnt = 1;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public int getCount() {
        return this.cnt;
    }
    
    public void incrementCount() {
        this.cnt++;
    }
}
