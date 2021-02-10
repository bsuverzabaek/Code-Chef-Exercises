//run as strangeNum
import java.util.Scanner;
import java.lang.Math;

public class strangeNum{
	public static void main(String[] args){
		int T;
		long X,K,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			X = scan.nextLong();
			K = scan.nextLong();

			assert(X>=1 && X<=1000000000) : "X must be 1 <= X <= 10^9";
			assert(K>=1 && K<=1000000000) : "K must be 1 <= K <= 10^9";

			count = 0;

			while(X%2==0){
				count++;
				X /= 2;
			}

			for(long i=3;i<=Math.sqrt(X);i+=2){
				while(X%i==0){
					count++;
					X /= i;
				}
			}

			if(X>2){
				count++;
			}

			if(count>=K){
				System.out.println("1");
			}else{
				System.out.println("0");
			}

			T--;
		}
	}
}