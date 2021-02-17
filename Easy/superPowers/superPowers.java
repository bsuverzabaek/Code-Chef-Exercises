//run as java -ea superPowers
import java.util.Scanner;

public class superPowers{
	public static void main(String[] args){
		int T,n;
		long N,p10;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();

		while(T>0){
			n = scan.nextInt();
			assert(n>=1 && n<=600000) : "N must be 1 <= N <= 600000";

			N = 0;
			p10 = 1;

			while(n!=0){
				N += (n&1)*p10;
				p10 *= 10;
				n /= 2;
			}

			System.out.println(bigMod(bigMod(2,N),2));

			T--;
		}
	}

	public static long bigMod(long a,long b){
		long mod = 1000000007;

		if(b==0){
			return 1;
		}

		long x = bigMod(a,b/2);
		x = (x*x)%mod;

		if(b%2!=0){
			x = (x*a)%mod;
		}

		return x;
	}
}