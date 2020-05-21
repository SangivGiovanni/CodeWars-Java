import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        ArrayList<Integer> ans = IntStream.of(elements).boxed().collect(Collectors.toCollection(ArrayList::new));

        for(int i = ans.size() -1; i > -1; i --) {
            if(Collections.frequency(ans, ans.get(i)) > maxOccurrences) {
                ans.remove(i);
            }
        }
        int[] answer = new int[ans.size()];
        for(int j = 0; j < ans.size(); j ++) {
            answer[j] = ans.get(j);
        }
        return answer;
    }
}