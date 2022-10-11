import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	double arr[] = new double[n];
	int max = 0;
	double sum = 0, avr = 0;
	
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
		if(max < arr[i]) {
			max = (int) arr[i];
		}
	}
	for(int i = 0; i<arr.length; i++) {
		arr[i] = arr[i] / max * 100;
		sum = arr[i] + sum;
	}
	avr = sum / n;
	
	System.out.println(avr);
	}

}
