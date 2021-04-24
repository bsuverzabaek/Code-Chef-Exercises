//run as java -ea gameDivisors
import java.util.Scanner;

public class gameDivisors{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10000";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100000000) : "N must be 2 <= N <= 10^8";

			if(solve(N)!=0){
				System.out.println("Mike");
			}else{
				System.out.println("Tom");
			}

			T--;
		}
	}

	public static int solve(int n){
		if(n==2 || n==17){
			return 1;
		}else if(n==16 || n==34 || n==289){
			return 0;
		}else{
			for(int i=2;i*i<=n;i++){
				if(n%i==0){
					return 1;
				}
			}

			return 0;
		}
	}
}