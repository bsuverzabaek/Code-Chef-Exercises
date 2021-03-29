//run as java -ea chefPizza
import java.util.Scanner;
import java.lang.Math;

public class chefPizza{
	public static void main(String[] args){
		int T;
		long N,ans,x,val,M;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		M = 1000000007;

		while(T>0){
			ans = 0;

			N = scan.nextLong();
			assert(N>=1 && N<=10000000000L) : "N must be 1 <= N <= 10^10";

			x = (long) Math.floor(Math.sqrt(N));

			for(long i=1;i<=x;i++){
				val = i;
				val = ((val%M)*((i+(long) Math.floor(N/i))%M))%M;
				val = ((val%M)*((1+(long) Math.floor(N/i)-i)%M))%M;

				ans = (ans%M+val%M)%M;
			}

			ans = (ans%M-((x*(x+1)*(2*x+1))/6)%M+M)%M;
			System.out.println(ans);

			T--;
		}
	}
}