package onboarding;

public class Problem4 {
    public static char ReverseAlphabet(char c) {
        int ascii = -1;
        if(c == ' ') {
            return ' ';
        }

        if(c >= 'A' && c <= 'Z') {
            ascii = c - 'A';
            c = (char) ('Z' - ascii);
            return c;
        }

        ascii = c - 'a';
        c = (char) ('z' - ascii);
        return c;
    }

    public static String solution(String word) {
        StringBuffer sb = new StringBuffer();
        char[] inputWord = word.toCharArray();

        for (char character : inputWord) {
            char result = ReverseAlphabet(character);
            sb.append(result);
        }
        return sb.toString();
    }
}