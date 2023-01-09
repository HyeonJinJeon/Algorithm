package hw4.num2;

public class shufflingSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]aux = new int[100]; 
		
		for(int i=0;i<aux.length;i++) {
			aux[i]=i+1;
		}
		System.out.println("원본");
		System.out.println(java.util.Arrays.toString(aux));

		int[] result = shuffle(aux);
		System.out.println("\n셔플본");
		System.out.println(java.util.Arrays.toString(result));
		
	sort(result);
	System.out.println("\n하위 3개 정렬");
	printArray(result);
		

	}
	static int[] shuffle(int[] arr) {
		int r1, r2;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			//for문이 돌아갈때마다 바뀌는 난수 r1, r2생성
			r1 = (int) (Math.random()*99);
			r2 = (int) (Math.random()*99);
			//변수에 배열 r1번의 값을 담기 -> swap용
			temp = arr[r1];
			//r1번째 값을 r2번째 값으로 바꿔주기
			arr[r1] = arr[r2];
			//r2번째 값에 swap용변수(r1)번 값 담아주기 
			arr[r2] = temp;
		}
		return arr;
	}
	static void sort(int arr[]){
        int n = arr.length;
        
        for(int i = 0; i < 3; i++){
            // 최소값을 찾는다.
            int min_idx = i;
            for(int j = i+1; j < 3; j++)
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            assert isSorted(arr, 0, i);
           
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
          
        }
        assert isSorted(arr);
    }
   
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < 3; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    private static boolean isSorted(int[] arr, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(arr[i], arr[i-1])) return false;
        return true;
    }
    
    private static boolean isSorted(int[] arr) {
        return isSorted(arr, 0, arr.length - 1);
}
  
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }    
}
