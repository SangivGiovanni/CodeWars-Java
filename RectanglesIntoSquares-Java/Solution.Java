import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {

        if(lng == wdth){
            return null;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int no = lng * wdth;

        while (no != 0){
            if(lng > wdth) {
                no -= wdth * wdth;
                ans.add(wdth);
                lng -= wdth;
            } else {
                no -= lng * lng;
                ans.add(lng);
                wdth -= lng;
            }
        } return ans;
    }
}