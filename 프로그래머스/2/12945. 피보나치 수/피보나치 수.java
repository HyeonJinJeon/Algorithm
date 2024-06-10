class Solution {
    public int solution(int n) {
        int[] arr = new int[n+1];
        int answer = 0;
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < n+1; i++){
            //피보나치 수를 계산한 다음에 나올 수를 1234567로 나눈 나머지는 각 연산을 수행할 때마다 1234567로 나누는 것과 완벽하게 동일한 숫자가 나온다
            arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
        }
        answer = arr[n];
        return answer;
    }
}