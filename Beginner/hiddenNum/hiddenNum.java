//run as java -ea hiddenNum
import java.util.Scanner;

public class hiddenNum{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000000000) : "N must be 1 <= N <= 10^9";

			if(N%2==0){
				System.out.println(2 + " " + N/2);
			}else{
				System.out.println(1 + " " + N);
			}

			T--;
		}
	}
}