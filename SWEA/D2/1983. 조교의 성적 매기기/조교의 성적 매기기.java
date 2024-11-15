import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt(); // 학생 수
            int k = sc.nextInt() - 1; // k번째 학생 (0-based index)

            int[][] arr = new int[n][3]; // 각 학생의 점수 저장 배열
            int[] sum = new int[n]; // 총점 저장 배열
            Map<Integer, Integer> map = new HashMap<>(); // 학생별 총점 매핑

            // 점수 입력
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
            }

            // 총점 계산 및 map에 저장
            for (int i = 0; i < n; i++) {
                sum[i] = arr[i][0] * 35 + arr[i][1] * 45 + arr[i][2] * 20;
                map.put(i, sum[i]); // 학생 인덱스와 총점 저장
            }

            // 총점 정렬을 위한 복사 및 정렬
            Integer[] sortedSum = Arrays.stream(sum).boxed().toArray(Integer[]::new);
            Arrays.sort(sortedSum, Collections.reverseOrder());

            // k번째 학생의 총점 가져오기
            int targetScore = map.get(k);

            // k번째 학생의 정렬 후 순위 찾기
            int rank = 0;
            for (int i = 0; i < n; i++) {
                if (sortedSum[i] == targetScore) {
                    rank = i;
                    break;
                }
            }
            // 등급 매핑
            String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            int numPerGrade = n / 10; // 등급당 학생 수
            String answer = grades[rank / numPerGrade];

            // 결과 출력
            System.out.println("#" + test_case + " " + answer);
        }
    }
}
