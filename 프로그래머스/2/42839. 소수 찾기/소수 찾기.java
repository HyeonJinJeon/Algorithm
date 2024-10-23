import java.util.*;
class Solution {
    private Set<Integer> numberSet = new HashSet<>();
    public int solution(String numbers) {
        dfs(numbers, "");
        
        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    private void dfs(String numbers, String current) {
        if (!current.isEmpty()) {
            numberSet.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            String next = current + numbers.charAt(i);
            String remain = numbers.substring(0, i) + numbers.substring(i + 1);
            dfs(remain, next);
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}