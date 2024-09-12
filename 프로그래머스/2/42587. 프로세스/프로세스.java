import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int answer = 0; 
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(i, priorities[i])); 
            pq.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            Process process = queue.poll();

            if (process.value == pq.peek()) {
                pq.poll();
                answer++;

                if (process.index == location) {
                    return answer;
                }
            } else {
                queue.add(process);
            }
        }
        return answer;
    }
        static class Process {
        int index;
        int value;

        public Process(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
