import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> mapFrom = new HashMap<>();
        Map<String, Integer> mapTo = new HashMap<>();
        int[] answer = new int[id_list.length];
        
        for(int i = 0; i < id_list.length; i++){
            mapFrom.put(id_list[i], 0);
            mapTo.put(id_list[i], 0);
        }
        Arrays.sort(report);
        for(int i = 0; i < report.length; i++){
            String from = report[i].split(" ")[0];
            String to = report[i].split(" ")[1];
            if(i == 0){
                int before = mapTo.get(to);
                mapTo.put(to, before+1);
            }
            if(i > 0 && !report[i].equals(report[i-1])){
                int before = mapTo.get(to);
                mapTo.put(to, before+1);
            }
        }
        for(int i = 0; i < id_list.length; i++){
            System.out.println(mapTo.get(id_list[i]));
        }
        for(int i = 0; i < report.length; i++){
            String from = report[i].split(" ")[0];
            String to = report[i].split(" ")[1];
            if(i ==0 && mapTo.get(to) >= k){
                mapFrom.put(from, mapFrom.get(from)+1);
            }
            if(i > 0 && !report[i].equals(report[i-1]) && mapTo.get(to) >= k){
                mapFrom.put(from, mapFrom.get(from)+1);
            }
        }
        for(int i = 0; i < id_list.length; i++){
            answer[i] = mapFrom.get(id_list[i]);
        }
        return answer;
    }
}