class Solution {
    public int solution(int[] ingredient) {
        int breadCount = 0; // 빵의 개수
        int veggieCount = 0; // 야채의 개수
        int meatCount = 0; // 고기의 개수
        int hamburgerCount = 0; // 포장된 햄버거의 개수

        // 재료 배열을 순회하며 햄버거 포장 가능 여부 확인
        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i] == 1) { // 빵인 경우
                breadCount++;
            } else if (ingredient[i] == 2) { // 야채인 경우
                if (breadCount > 0) { // 빵이 쌓여있어야 함
                    veggieCount++;
                }
            } else if (ingredient[i] == 3) { // 고기인 경우
                if (breadCount > 0 && veggieCount > 0) { // 빵과 야채가 쌓여있어야 함
                    meatCount++;
                }
            }

            // 빵-야채-고기-빵 순서대로 쌓인 햄버거인지 확인하여 포장
            if (breadCount >= 2 && veggieCount >= 1 && meatCount >= 1) {
                hamburgerCount++;
                breadCount -= 2;
                veggieCount -= 1;
                meatCount -= 1;
            }
        }

        return hamburgerCount;
    }
}
