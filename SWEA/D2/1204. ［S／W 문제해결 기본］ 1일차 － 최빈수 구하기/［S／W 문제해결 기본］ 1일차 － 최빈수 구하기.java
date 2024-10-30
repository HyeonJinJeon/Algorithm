import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int test_case = 1; test_case <= T; test_case++) {
            int caseNumber = sc.nextInt(); // 테스트 케이스 번호
            int[] scores = new int[1000];

            // 점수 입력 받기
            for (int i = 0; i < 1000; i++) {
                scores[i] = sc.nextInt();
            }
            // 점수 빈도수를 계산하기 위한 Map
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int score : scores) {
                countMap.put(score, countMap.getOrDefault(score, 0) + 1);
            }

            // 최빈수 계산
            int mode = 0; // 최빈수
            int maxCount = 0; // 최빈수의 발생 횟수

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int currentScore = entry.getKey();
                int currentCount = entry.getValue();

                // 현재 값이 최대 발생 횟수보다 크거나, 같고 점수가 더 큰 경우
                if (currentCount > maxCount || (currentCount == maxCount && currentScore > mode)) {
                    mode = currentScore; // 최빈수 업데이트
                    maxCount = currentCount; // 최대 발생 횟수 업데이트
                }
            }

            // 결과 출력
            System.out.println("#" + caseNumber + " " + mode);
        }
        sc.close();
    }
}
