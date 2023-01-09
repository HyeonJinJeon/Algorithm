package hw2.num2;

import static java.lang.Math.*;

public class SelectionSort {
    public static void main(String[] args) {
        double [] select = new double[10000];
        int N = select.length;
        
        for(int i=0; i<N; i++){
            select[i] = random();
        }

        long beforeTime = System.currentTimeMillis(); //시작 시간 기억하기

        for(int i=0; i<N; i++){
            int min = i;
            for(int j=i+1; j<N;j++){
                if(less(select[j], select[min])){
                    min = j;
                } 
            }
            exch(select, i, min);
        }

        long afterTime = System.currentTimeMillis(); //종료 시간 기억하기

        System.out.println("selection Sort 수행 속도 : " + (afterTime-beforeTime));

    }

    private static boolean less(double current, double min){
        if(current<min){
            return true;
        }
        else {
            return false;
        }
    }


    private static void exch(double[] arr, int i, int min){
        double temp;
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
