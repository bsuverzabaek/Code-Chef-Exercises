import java.util.Scanner;
import java.lang.Math;

public class strat{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		System.out.print("Input T: ");
		T = scan.nextInt();

		while(T > 0){
			int n;
			System.out.print("Input n: ");
			n = scan.nextInt();

			int[] arr = new int[n];

			for(int i=0;i<n;i++){
				arr[i] = (int)(Math.random() * 100 + 1);
				System.out.print(arr[i] + " ");
			}
			System.out.println(" ");

			if(p_first(arr,n) == p_second(arr,n)){
				System.out.println("draw");
			}else if(p_first(arr,n) > p_second(arr,n)){
				System.out.println("first");
			}else{
				System.out.println("second");
			}

			T--;
		}
	}

	public static int p_first(int[] arr, int n){
		int p = 0;
		p += arr[0];

		if(n > 2){
			for(int i=3;i<n;i+=2){
				p += arr[i];
			}
		}

		return p;
	}

	public static int p_second(int[] arr, int n){
		int p = 0;
		if(n == 1){
			return p;
		}else if(n == 2){
			p += arr[1];
			return p;
		}else if(n == 3){
			p += arr[1];
			p += arr[2];
			return p;
		}else{
			p += arr[1];
			p += arr[2];
			for(int i=4;i<n;i+=2){
				p += arr[i];
			}
			return p;
		}
	}
}