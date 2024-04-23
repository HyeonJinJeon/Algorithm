import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[] price = new int[n];
            long remain = 0;

            for (int j = 0; j < n; j++) {
                price[j] = sc.nextInt();
            }
            int max = price[n-1];
            
            for(int i = n-1; i >-1; i--){
                if (price[i] < max){
                	remain += (max - price[i]);
                }else {
                    max = price[i];
                }
            }
            System.out.println("#"+ test_case + " " + remain);
        }
    }
}