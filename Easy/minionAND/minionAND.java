//run as java -ea minionAND
import java.util.Scanner;

public class minionAND{
	public static void main(String[] args){
		int T,N,Q,L,R,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100000) : "A["+i+"] must be 1 <= A[i] <= 10^5";
			}

			Q = scan.nextInt();
			assert(Q>=1 && Q<=100000) : "Q must be 1 <= Q <= 10^5";

			while(Q>0){
				L = scan.nextInt();
				R = scan.nextInt();

				flag = 0;
				L--;
				R--;

				for(int i=L;i<=R;i++){
					if(A[i]%2==0){
						flag = 1;
						break;
					}
				}

				if(flag==1){
					System.out.println("EVEN");
				}else{
					System.out.println("ODD");
				}

				Q--;
			}
			
			T--;
		}
	}
}