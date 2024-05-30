class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            String direction = route.split(" ")[0];
            int size = Integer.parseInt(route.split(" ")[1]);
            int newX = answer[0];
            int newY = answer[1];

            if (direction.equals("E")) {
                int rollback = answer[1];
                if (answer[1] + size >= park[answer[0]].length() || answer[1] + size < 0) {
                    continue;
                }
                for (int j = 1; j <= size; j++) {
                    if (park[answer[0]].charAt(answer[1] + j) == 'X') {
                        answer[1] = rollback;
                        break;
                    } else if (j == size) {
                        answer[1] += size;
                    }
                }
            }
            else if (direction.equals("W")) {
                int rollback = answer[1];
                if (answer[1] - size < 0 || answer[1] - size >= park[answer[0]].length()) {
                    continue;
                }
                for (int j = 1; j <= size; j++) {
                    if (park[answer[0]].charAt(answer[1] - j) == 'X') {
                        answer[1] = rollback;
                        break;
                    } else if (j == size) {
                        answer[1] -= size;
                    }
                }
            }
            else if (direction.equals("N")) {
                int rollback = answer[0];
                if (answer[0] - size < 0 || answer[0] - size >= park.length) {
                    continue;
                }
                for (int j = 1; j <= size; j++) {
                    if (park[answer[0] - j].charAt(answer[1]) == 'X') {
                        answer[0] = rollback;
                        break;
                    } else if (j == size) {
                        answer[0] -= size;
                    }
                }
            }
            else if (direction.equals("S")) {
                int rollback = answer[0];
                if (answer[0] + size >= park.length || answer[0] + size < 0) {
                    continue;
                }
                for (int j = 1; j <= size; j++) {
                    if (park[answer[0] + j].charAt(answer[1]) == 'X') {
                        answer[0] = rollback;
                        break;
                    } else if (j == size) {
                        answer[0] += size;
                    }
                }
            }
        }
        return answer;
    }
}
