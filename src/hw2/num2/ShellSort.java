package hw2.num2;

import static java.lang.Math.*;

public class ShellSort {
    public static void main(String[] args) {
        double [] shell = new double[10000];
        int N = shell.length;
        
        for(int i=0; i<N; i++){
        	shell[i] = random();	
        }

        long beforeTime = System.currentTimeMillis(); //정렬 전 시간

       int h = 1;

       while(h < N/3){
           h = 3*h +1;
       }

       while(h>=1){
           for(int i=h; i<N;i++){
               for(int j=i; j>=h && less(shell[i], shell[i-h]); j-=h) {
                   exch(shell, j, j - h);
               }
           }
           h = h/3;
       }

        long afterTime = System.currentTimeMillis(); //정렬 후 시간

        System.out.println("shellsort 정렬 속도 : " + (afterTime-beforeTime));

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