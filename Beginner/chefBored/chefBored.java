//run as java -ea chefBored
import java.util.Scanner;

public class chefBored{
	public static void main(String[] args){
		int T,N,count,j;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";

			count = 0;

			for(int i=1;i<=N;i+=2){
				j = N-i+1;
				count += (j*j);
			}

			System.out.println(count);

			T--;
		}
	}
}