//run as java -ea trainPartner
import java.util.Scanner;

public class trainPartner{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=500) : "N must be 1 <= N <= 500";

			if(N%8==1){
				System.out.println(N+3+"LB");
			}else if(N%8==4){
				System.out.println(N-3+"LB");
			}else if(N%8==2){
				System.out.println(N+3+"MB");
			}else if(N%8==5){
				System.out.println(N-3+"MB");
			}else if(N%8==3){
				System.out.println(N+3+"UB");
			}else if(N%8==6){
				System.out.println(N-3+"UB");
			}else if(N%8==7){
				System.out.println(N+1+"SU");
			}else if(N%8==0){
				System.out.println(N-1+"SL");
			}

			T--;
		}
	}
}