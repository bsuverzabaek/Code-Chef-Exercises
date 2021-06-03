//run as java -ea adaSchool
import java.util.Scanner;

public class adaSchool{
	public static void main(String[] args){
		int T,N,M;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5000) : "T must be 1 <= T <= 5000";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=2 && N<=50) : "N must be 2 <= N <= 50";
			assert(M>=2 && M<=50) : "M must be 2 <= M <= 50";

			if((N*M)%2==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}