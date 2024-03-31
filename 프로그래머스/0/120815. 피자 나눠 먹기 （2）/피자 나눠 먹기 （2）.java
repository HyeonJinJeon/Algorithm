class Solution {
    public int solution(int n) {
        int answer = 0;
        int slice = 6;
        int euclidean = getEuclidean(n, slice);
        answer = (slice * n) / euclidean / 6;
        return answer;
    }
    //유클리드 호제법
    public static int getEuclidean(int n, int slice){
        int euclidean = 0;
        if(n > slice){
            if(slice == 0){
                return n;
            } else {
                return getEuclidean(slice, n % slice);

            }
        }else{
            if(n == 0){
                return slice;
            } else {
                return getEuclidean(n, slice % n);
            }
        }
    }
}