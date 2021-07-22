//run as java -ea testRobot
import java.util.Scanner;

public class testRobot{
	public static void main(String[] args){
		int T,N,X,min,max;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			X = scan.nextInt();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";
			assert(X<=1000000) : "X must be <= 1000000";

			String S;
			S = scan.next();

			min = X;
			max = X;

			for(int i=0;i<N;i++){
				assert(S.charAt(i)=='L' || S.charAt(i)=='R') : "S must be only 'L' or 'R'";

				if(S.charAt(i)=='R'){
					X++;

					if(X>max){
						max = X;
					}

					if(X<min){
						min = X;
					}
				}

				if(S.charAt(i)=='L'){
					X--;

					if(X>max){
						max = X;
					}

					if(X<min){
						min = X;
					}
				}
			}

			System.out.println((max-min)+1);

			T--;
		}
	}
}