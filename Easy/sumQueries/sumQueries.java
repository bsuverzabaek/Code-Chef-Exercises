//run as java -ea sumQueries
import java.util.Scanner;

public class sumQueries{
	public static void main(String[] args){
		int N,M,q;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		assert(N>=1 && N<=1000000000) : "N must be 1 <= N <= 10^9";
		assert(M>=1 && M<=100000) : "M must be 1 <= M <= 10^5";

		while(M>0){
			q = scan.nextInt();
			assert(q>=1 && q<=3*N) : "q must be 1 <= q <= 3N";

			if(q>=(N+2) && q<=((2*N)+1)){
				System.out.println(q-N-1);
			}else if(q>=(2*(N+1)) && q<=(3*N)){
				System.out.println((3*N)-q+1);
			}else{
				System.out.println(0);
			}

			M--;
		}
	}
}