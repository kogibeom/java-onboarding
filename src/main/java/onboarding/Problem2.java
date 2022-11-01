package onboarding;

public class Problem2 {
    public static int findStart(String cryptogram) {
        int start = -1;
        for(int i = 0; i<cryptogram.length()-1; i++) {
            if(cryptogram.charAt(i) == cryptogram.charAt(i+1)) {
                start = i; break;
            }
        }
        return start;
    }

    public static int findEnd(String cryptogram, int start) {
        int end = start;
        for(int i = start; i<cryptogram.length(); i++) {
            if(cryptogram.length() == 2) {
                return start + 1;
            }
            if(cryptogram.charAt(start) != cryptogram.charAt(i+1)) {
                end = i;
                break;
            }
        }
        return end;
    }

    public static String decodeWord(String cryptogram, int start, int end) {
        StringBuilder sb = new StringBuilder();
        sb.append(cryptogram);
        sb.replace(start, end + 1, "");
        return sb.toString();
    }

    public static String solution(String cryptogram) {
        while(true) {

            int start = findStart(cryptogram);

            if(start != -1) {
                int end = findEnd(cryptogram, start);

                String word = decodeWord(cryptogram, start, end);
                if(word.equals(cryptogram)) {
                    break;
                }
                cryptogram = word;
            } else break;
        }
        return cryptogram;
    }
}
