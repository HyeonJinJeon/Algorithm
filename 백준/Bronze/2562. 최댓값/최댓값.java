import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int []arr = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0, order = 0;
		
		for(int i=0; i<9; i++) {
			if(max < arr[i]) {
				max = arr[i];
				order = i+1;
			}
		}
		System.out.println(max);
		System.out.println(order);
	}
}
