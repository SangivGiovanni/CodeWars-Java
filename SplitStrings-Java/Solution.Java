public class StringSplit {
    public static String[] solution(String s) {

        String[] ans;
        if(s.length() % 2 == 0) {
            ans = new String[s.length() / 2];

            for(int i = 0; i < s.length()/2; i++){
                ans[i] = String.valueOf(s.charAt(i*2)) + String.valueOf(s.charAt(i*2 + 1));
            }

        } else {
            ans = new String[s.length() / 2 + 1];

            for(int i = 0; i < s.length()/2; i++){
                ans[i] = String.valueOf(s.charAt(i*2)) + String.valueOf(s.charAt(i*2 + 1));
            }
            ans[s.length()/2] = String.valueOf(s.charAt(s.length() - 1) + "_");
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}