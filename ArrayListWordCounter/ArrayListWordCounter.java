package ArrayListWordCounter;

public class ArrayListWordCounter {

    public static boolean isStringOnlyAlphabet(String str) {
        return ((str != null) && (!str.equals(""))
            && (str.matches("^[a-zA-Z]*$")));
    }

    public static void main(String[] args) {
        System.out.println("The ArrayList Word Counter application\n");
        Words words = new Words("c:/temp/king-james.txt");
        words.print();      
    }
}