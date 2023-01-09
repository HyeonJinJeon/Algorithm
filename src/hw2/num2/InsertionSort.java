package hw2.num2;

import static java.lang.Math.*;

public class InsertionSort {

	public static void main(String[] args) {
    	
        double [] insert = new double[10000];
        int N = insert.length;

        for(int i=0; i<N; i++){
            insert[i] = random();
        }

        long beforeTime = System.currentTimeMillis(); //현재 시간 기억 시키기

        for(int i=0; i<N; i++){ //크기 비교
            for(int j=i; j>0 && less(insert[j], insert[j-1]); j--){
                exch(insert, j, j-1);
            }
        }

        long afterTime = System.currentTimeMillis(); //종료 후 시간 기억 시키기
        System.out.println("insertionSort 실행 속도 : " + (afterTime-beforeTime));

    }

	private static boolean less(double current, double min) {
		if (current < min) {
			return true;
		} 
		else
			return false;

	}

	private static void exch(double[] arr, int i, int min) {
		double temp;
		temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}

}