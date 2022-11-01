package onboarding;

public class Problem2 {
<<<<<<< HEAD
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
=======
>>>>>>> parent of a0d8bbf (feat : 중복 지점 찾는 기능)
    public static String solution(String cryptogram) {
        String answer = "answer";
        return answer;
    }
}
