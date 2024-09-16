import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = -1;
        String changeNum = Integer.toString(n,k);
        return sliceNum(changeNum);
    }
    
    public int sliceNum(String changeNum){
        StringBuffer sb = new StringBuffer();
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < changeNum.length(); i++){
            if(changeNum.charAt(i) != '0'){
                sb.append(changeNum.charAt(i));
                if(i == changeNum.length()-1){
                    list.add(sb.toString());
                }
            }else{
                list.add(sb.toString());
                sb.setLength(0);   
            }
        }
        return isPrime(list);
    }
    
    public int isPrime(List<String> list){
        int result = 0;
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            if(!str.equals("")){
                long num = Long.parseLong(str);
                System.out.println(num);
                
                if(num == 2 || num == 3){
                    result++;
                }else{
                    for(long j = 2; j <= (long)Math.sqrt(num); j++){
                        if(num%j == 0){
                            System.out.println(j);
                            break;
                        }else if(j == (long)Math.sqrt(num) && num%j != 0){
                            System.out.println(j);
                            result++;
                        }
                    } 
                }
            }
        }
        return result;
    }
}