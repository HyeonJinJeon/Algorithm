import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine(); // 입력받은 숫자를 문자열로 받음

        // 각 자리수를 배열에 저장
        char[] digits = number.toCharArray();

        // 배열 정렬 (내림차순)
        Arrays.sort(digits);
        
        // 정렬된 배열을 역순으로 출력
        StringBuilder sb = new StringBuilder(new String(digits));
        System.out.println(sb.reverse().toString());
    }
}
