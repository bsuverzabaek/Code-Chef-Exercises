//run as java -ea pingPaja
import java.util.Scanner;

public class pingPaja{
	public static void main(String[] args){
		int T,X,Y,K,a;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			X = scan.nextInt();
			Y = scan.nextInt();
			K = scan.nextInt();

			assert(X>=0 && X<=1000000000) : "X must be 0 <= X <= 10^9";
			assert(Y>=0 && Y<=1000000000) : "Y must be 0 <= Y <= 10^9";
			assert(K>=1 && K<=1000000000) : "K must be 1 <= K <= 10^9";

			a = (X+Y)/K;

			if(a%2==0){
				System.out.println("Chef");
			}else{
				System.out.println("Paja");
			}

			T--;
		}
	}
}