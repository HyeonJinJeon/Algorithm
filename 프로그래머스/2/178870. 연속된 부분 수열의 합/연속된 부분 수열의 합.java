class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0, sum = 0, preLen = Integer.MAX_VALUE;

        for (int right = 0; right < sequence.length; right++) {
            sum += sequence[right];

            while (sum > k && left <= right) {
                sum -= sequence[left++];
            }

            if (sum == k) {
                int nowLen = right - left;
                if (nowLen < preLen) {
                    preLen = nowLen;
                    answer[0] = left;
                    answer[1] = right;
                }
            }
        }
        return answer;
    }
}
