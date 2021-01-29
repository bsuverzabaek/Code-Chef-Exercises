//run as java -ea gudduDate
import java.util.Scanner;

public class gudduDate{
	public static void main(String[] args){
		int T;
		long N,a,n;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		while(T>0){
			N = scan.nextLong();
			assert(N>=1 && N<=1000000000) : "N must be 1 <= N <= 10^18";

			a = 0;
			n = N;

			while(n!=0){
				a = a+n%10;
				n /= 10;
			}

			for(long i=0;i<10;i++){
				if((a+i)%10==0){
					System.out.println(N+""+i);
					break;
				}
			}

			T--;
		}	
	}
}