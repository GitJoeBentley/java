package joe.mapwordcounter;

public class MapWordCounter {

    public static boolean isStringOnlyAlphabet(String str) {
        return ((str != null) && (!str.equals(""))
            && (str.matches("^[a-zA-Z]*$")));
    }
    public static void main(String[] args) {
        Words words = new Words("c:/temp/king-james.txt");
        words.print();      
    }
}
