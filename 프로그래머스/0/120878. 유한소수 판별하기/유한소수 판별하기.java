import java.util.ArrayList;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = gcd(a, b);
        a /= n;
        b /= n;

        for (int i = 2; i <= b; i++) {
            if (b % i == 0) {
                list.add(i);
                b /= i;
                i--; // 같은 소수로 다시 나누기 위해 i를 감소시킴
            }
        }

        boolean isFinite = true;
        for (Integer value : list) {
            if (value != 2 && value != 5) {
                isFinite = false;
                break;
            }
        }

        answer = isFinite ? 1 : 2;
        return answer;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
