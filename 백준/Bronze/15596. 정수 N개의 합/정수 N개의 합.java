import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		long result = sum(a);
		System.out.println(result);
	}
    static long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++) {
        	ans = ans + a[i];
        }
        return ans;
    }
}