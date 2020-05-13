public class JadenCase {

    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        } else if (phrase == "") {
            return null;
        }
        char[] chars = phrase.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase((chars[i]));
            } else if (Character.isLetter(chars[i]) && Character.isWhitespace(chars[i - 1])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        } return String.valueOf(chars);
    }
}