//run as java -ea strikeSpare

import java.util.Scanner;

public class strikeSpare{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			System.out.print("1 1");

			for(int i=0;i<N/2;i++){
				System.out.print("0");
			}

			System.out.println();

			T--;
		}
	}
}