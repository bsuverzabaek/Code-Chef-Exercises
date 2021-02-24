//run as java -ea goodGrid
import java.util.Scanner;

public class goodGrid{
	public static void main(String[] args){
		int T,N,X,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			X = scan.nextInt();

			assert(N>=1 && N<=5000) : "N must be 1 <= N <= 5000";
			assert(X>=1 && X<=N*N) : "X must be 1 <= X <= N^2";

			flag = 0;

			for(int i=1;i<=N;i++){
				if(X%i==0 && X/i<=N){
					flag = 1;
					break;
				}
			}

			if(flag==1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			T--; 
		}
	}
}