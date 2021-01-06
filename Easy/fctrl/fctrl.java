import java.util.Scanner;
import java.lang.Math;

public class fctrl{
	public static void main(String[] args) {
		int T;
		int i;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100000){
				System.out.println("T must be 1 <= T <= 100000");
			}else{
				break;
			}
		}

		while(T>0){
			int N;

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>1000000000){
					System.out.println("N must be 1 <= N <= 10^9");
				}else{
					break;
				}
			}

			int count = 0;
			i = 1;

			while(true){
				if(N/Math.pow(5,i)<1){
					break;
				}else{
					count += N/Math.pow(5,i);
				}

				i++;

			}

			System.out.println(count);

			T--;
		}
	}
}