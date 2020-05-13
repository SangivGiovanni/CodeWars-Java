public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int ncount = 0;
        int ecount = 0;
        int scount = 0;
        int wcount = 0;

        for (int i = 0; i < walk.length; i++) {
            if (String.valueOf(walk[i]).equals("n")) {
                ncount += 1;
            } else if (String.valueOf(walk[i]).equals("s")) {
                scount +=1;
            } else if (String.valueOf(walk[i]).equals("e")) {
                ecount +=1;
            } else if (String.valueOf(walk[i]).equals("w")) {
                wcount +=1;
            }
        } return walk.length == 10 && ncount == scount && ecount == wcount;
    }
}