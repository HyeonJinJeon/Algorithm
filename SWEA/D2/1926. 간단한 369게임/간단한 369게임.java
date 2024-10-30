import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 케이스 수
        
        for(int i = 1; i <= n; i ++) {
        	int num = i;
        	int cnt = 0;
        	while(num != 0) {
        		if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
        			cnt++;
        		}
        		num /= 10;
        	}
        	if(cnt == 0) {
        		System.out.print(i + " ");
        	}else {
        		String clap = "";
        		for(int j = 0; j < cnt; j++) {
        			clap += "-";
        		}
        		System.out.print(clap + " ");
        	}       	
        }       
        sc.close();
    }
}
