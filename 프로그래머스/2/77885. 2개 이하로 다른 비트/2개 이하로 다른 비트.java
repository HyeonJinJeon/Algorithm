class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];

            if (x % 2 == 0) { //짝수
                answer[i] = x + 1;
            } else { //홀수
                long temp = x;
                long base = 1;

                while (temp % 2 == 1) {
                    temp /= 2;
                    base *= 2;
                }

                answer[i] = x + base - (base / 2);
            }
        }

        return answer;
    }
}
