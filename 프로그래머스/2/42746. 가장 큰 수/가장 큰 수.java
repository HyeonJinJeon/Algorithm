import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // 숫자 배열을 문자열 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 사용자 정의 정렬 기준을 사용하여 정렬
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        // 모든 숫자가 0인 경우를 처리
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 정렬된 문자열을 하나의 문자열로 합침
        StringBuilder answer = new StringBuilder();
        for (String num : strNumbers) {
            answer.append(num);
        }

        return answer.toString();
    }
}