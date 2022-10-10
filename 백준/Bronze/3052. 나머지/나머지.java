import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		boolean bl = false;
		
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[10];
		int []remain = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			remain[i] = arr[i] % 42;
		}
		
		for(int i=0; i<remain.length; i++) {
			bl = false;
			for(int j=i+1; j<remain.length; j++) {
				if(remain[i] == remain[j]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				count++;
			}
		}
		System.out.println(count);
	}

}