import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> carState = new HashMap<>();
        Map<String, Integer> carIn = new HashMap<>();
        Map<String, Integer> carOut = new HashMap<>();
        
        for(int i = 0; i < records.length; i++){
            
            String carNum = records[i].split(" ")[1];
            String type = records[i].split(" ")[2];
            carState.put(carNum, type);
            if(carState.get(carNum).equals("IN")){
                int time = Integer.parseInt(records[i].split(" ")[0].split(":")[0]) * 60
                    + Integer.parseInt(records[i].split(" ")[0].split(":")[1]);
                carIn.put(carNum, time);
            }else{
                int time = Integer.parseInt(records[i].split(" ")[0].split(":")[0]) * 60 
                    + Integer.parseInt(records[i].split(" ")[0].split(":")[1]);
                carOut.put(carNum, time);
            }
            
            if(carState.get(carNum).equals("OUT")){
                int resultTime = map.getOrDefault(carNum, 0) 
                    + carOut.get(carNum) - carIn.get(carNum);
                map.put(carNum, resultTime);
            }
        }
        for (String key : carState.keySet()) {
            if (carState.get(key).equals("IN")) {
                int newTime = map.getOrDefault(key, 0) + 1439 - carIn.get(key);
                map.put(key, newTime);
            }
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        int[] answer = new int[map.size()];
        int index = 0;
        for (String key : keySet) {
            int totalTime = map.get(key);
            if (totalTime <= fees[0]) {
                answer[index++] = fees[1]; 
            } else {
                int extraTime = totalTime - fees[0];
                int extraFee = (int) Math.ceil((double) extraTime / fees[2]) * fees[3];
                answer[index++] = fees[1] + extraFee;
            }
        }

        return answer;
    }
}