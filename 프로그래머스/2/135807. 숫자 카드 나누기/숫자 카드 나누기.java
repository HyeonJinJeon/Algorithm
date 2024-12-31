import java.util.*;
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = getGCD(arrayA);
        int gcdB = getGCD(arrayB);
        
        int answerA = isValidDivisor(gcdA, arrayB) ? gcdA : 0;
        int answerB = isValidDivisor(gcdB, arrayA) ? gcdB : 0;
        return Math.max(answerA, answerB);
    }
    
    private int getGCD(int[] array) {
        int gcd = array[0];
        for(int num : array) {
            gcd = gcd(gcd, num);
            if(gcd == 1) {
                return 1;
            }
        }
        return gcd;
    }
    private int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;    
        }
        return a;
    }
    private boolean isValidDivisor(int gcd, int[] array) {
        for(int num : array) {
            if (num%gcd == 0) {
                return false;
            }
        }
        return true;
    }
}