import java.util.ArrayList;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        ArrayList<Character> count = new ArrayList<>();
        ArrayList<Character> dup = new ArrayList<>();

        for(int i = 0; i < text.length(); i++) {
            if(count.contains(text.toLowerCase().charAt(i))
                    && !(dup.contains(text.toLowerCase().charAt(i)))) {
                dup.add(text.charAt(i));
            } else {
                count.add(text.charAt(i));
            }
        } return dup.size();
    }
}