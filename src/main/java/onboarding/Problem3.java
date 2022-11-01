package onboarding;

public class Problem3 {

    private static int getCount(int num) {
        int count = 0;
        while (num != 0) {
            if(num%10 != 0 && num%10%3 ==0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static int solution(int number) {
        int answer = 0;
        for(int i =1; i<=number; i++) {
            answer += getCount(i);
        }
        return answer;
    }
}
