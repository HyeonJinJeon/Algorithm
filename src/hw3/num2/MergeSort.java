package hw3.num2;

import java.util.Arrays;

public class MergeSort {
    public static int[] src;
    public static int[] tmp;
    public static void main(String[] args) {
    	src = new int[10];
		for (int i = 0; i < 10; i++) {
			src[i] = (int) (Math.random() * 10);
		}
        tmp = new int[src.length];
        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(src));
        mergeSort(0, src.length-1);
        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(src));
    }

    public static void mergeSort(int start, int end) {

        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            
            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && src[p]<src[q])) {
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }
            
            for (int i=start;i<=end;i++) {
                src[i]=tmp[i];
            }
        }
    }

    public static void printArray(int[] a) {

        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println();
    }
}