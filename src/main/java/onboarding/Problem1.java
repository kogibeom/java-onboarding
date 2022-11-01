package onboarding;

import java.util.*;

class Problem1 {
    static int max(int page) {
        List<Integer> pageDigit = new ArrayList<>();
        while(page > 0) {
            int num = page % 10;
            pageDigit.add(num);

            page /= 10;
        }
        int sum = 0; int mul = 1;
        for (Integer integer : pageDigit) {
            sum += integer;
            mul *= integer;
        }
        return Math.max(sum, mul);
    }
    static int compareScore(List<Integer> player) {
        int max = 0;
        for (Integer page : player) {
            int tmp = max(page);
            if(max < tmp) max = tmp;
        }
        return max;
    }

    static boolean pageChack(List<Integer> player) {
        for (Integer i : player) {
            if (i < 1 || i > 400) {
                return false;
            }
        }
        if(player.size() != 2) return false;

        if (player.get(0) % 2 != 1 || player.get(1) % 2 !=0) {
            return false;
        }
        return player.get(1) - player.get(0) == 1;
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        /*예외사항 메소드*/
        if(!pageChack(pobi) || !pageChack(crong)){
            return -1;
        }
        /*플레이어 최대값*/
        int pobiMax = compareScore(pobi);
        int crongMax = compareScore(crong);
        /*승부 확인*/
        if(pobiMax > crongMax) {
            return 1;
        }
        if (pobiMax < crongMax) {
            return 2;
        }
        return 0;
    }
}