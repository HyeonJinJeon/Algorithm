class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int z = j + 1; z < nums.length; z++){
                    sum = nums[i] + nums[j] + nums[z];
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                flag =  false;
                break;
            }
        }
        return flag;
    }
}