//run as java -ea shareCandies
import java.util.Scanner;

public class shareCandies{
	public static void main(String[] args){
		int T;
		long A,B,C,D,g,diff;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10^4";

		while(T>0){
			A = scan.nextLong();
			B = scan.nextLong();
			C = scan.nextLong();
			D = scan.nextLong();

			assert(A>=1 && A<=100000000000000L) : "A must be 1 <= A <= 10^14";
			assert(B>=1 && B<=100000000000000L) : "B must be 1 <= B <= 10^14";
			assert(C>=1 && C<=100000000000000L) : "C must be 1 <= C <= 10^14";
			assert(D>=1 && D<=100000000000000L) : "D must be 1 <= D <= 10^14";

			g = gcd(C,D);
			diff = A-B;

			if(diff<0){
				diff = B-A;
			}

			diff %= g;

			if(g-diff<diff){
				diff = g-diff;
			}

			System.out.println(diff);

			T--;
		}
	}

	public static long gcd(long C,long D){
		if(D==0){
			return C;
		}

		return gcd(D,C%D);
	}
}