class Solution {
    public String solution(int age) {
        char[] s = String.valueOf(age).toCharArray();
        
        String answer = "";
        
        String[] iage = {"0","1","2","3","4","5","6","7","8","9"};
        String[] sage= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < iage.length; j++){
                if(s[i] == iage[j].charAt(0)){
                    answer = answer + sage[j];
                }
            }
        }
        return answer;
    }
}