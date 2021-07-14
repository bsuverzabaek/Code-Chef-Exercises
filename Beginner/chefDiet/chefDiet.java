//run as java -ea chefDiet
import java.util.Scanner;

public class chefDiet{
	public static void main(String[] args){
		int T,N,K,prt,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=200) : "T must be 1 <= T <= 200";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			K = scan.nextInt();
			assert(K>=1 && K<=1000000) : "K must be 1 <= K <= 10^6";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000) : "A["+i+"] must be 1 <= A[i] <= 10^6";
			}

			prt = 0;
			flag = 0;

			for(int i=1;i<=N;i++){
				prt += A[i-1]-K;

				if(prt<0){
					flag = i;
					break;
				}
			}

			if(flag==0){
				System.out.println("YES");
			}else{
				System.out.println("NO" + " " + flag);
			}

			T--;
		}
	}
}