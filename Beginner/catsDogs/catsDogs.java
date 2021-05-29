//run as java -ea catsDogs
import java.util.Scanner;

public class catsDogs{
	public static void main(String[] args){
		int T;
		long C,D,L,min;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		min = 0;

		while(T>0){
			C = scan.nextLong();
			D = scan.nextLong();
			L = scan.nextLong();

			assert(C>=0 && C<=1000000000) : "C must be 1 <= C <= 10^9";
			assert(D>=0 && D<=1000000000) : "D must be 1 <= D <= 10^9";
			assert(L>=0 && L<=1000000000) : "L must be 1 <= L <= 10^9";

			if(2*D>=C){
				min = 4*D;
			}else if(2*D<C){
				min = 4*(C-D);
			}

			if(L<min){
				System.out.println("no");
			}else if(L%4!=0){
				System.out.println("no");
			}else if(L>=min && L<=4*(D+C) && L%4==0){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

			T--;
		}
	}
}