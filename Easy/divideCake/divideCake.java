//run as java -ea divideCake
import java.util.Scanner;

public class divideCake{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10000";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10000";

			if(360%N==0){
				System.out.print("y ");
			}else{
				System.out.print("n ");
			}

			if(N<=360){
				System.out.print("y ");
			}else{
				System.out.print("n ");
			}

			if(N*(N+1)/2<=360){
				System.out.println("y");
			}else{
				System.out.println("n");
			}

			T--;
		}
	}
}