package hw5.num2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class dynamicMedian {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력받을 데이터 수를 입력하시오");
        N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.comparingInt(a -> -a));

       
        StringBuilder sb = new StringBuilder();
        System.out.println("데이터 값을 입력하시오");
        for (int i = 0; i < N; i++) {
            int inputNumber = Integer.parseInt(br.readLine());
            add(inputNumber, minHeap, maxHeap);
            int midVal = getMid(minHeap, maxHeap);
            sb.append(i+1 + "개의 값을 넣었을 때 중앙값 :" + midVal);
            if(i != N-1) sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void add(int inputNumber, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if(minHeap.isEmpty() && maxHeap.isEmpty()) {
            maxHeap.add(inputNumber); return;
        }

        if(maxHeap.peek() < inputNumber) {
            minHeap.add(inputNumber);
        }else {
            maxHeap.add(inputNumber);
        }

        if(maxHeap.size() - minHeap.size() == 2) {
            int maxVal = maxHeap.poll();
            minHeap.add(maxVal);
        }

        if(minHeap.size() - maxHeap.size() == 2) {
            int minVal = minHeap.poll();
            maxHeap.add(minVal);
        }
    }

    private static int getMid(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if(minHeap.size() == maxHeap.size()) {
            return Math.min(minHeap.peek(), maxHeap.peek());
        }

        /*
        주어진 입력의 개수가 홀수인 경우, heap 사이즈가 하나 큰 쪽이 답을 가진다.
         */
        if(minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        }
        return maxHeap.peek();

    }
}