//run as java -ea wolfSheep
import java.util.Scanner;

public class wolfSheep{
	public static void main(String[] args){
		int T,N,M,x,y,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=10) : "N must be 1 <= N <= 10";
			assert(M>=0 && M<=20) : "M must be 0 <= M <= 20";

			int[] A = new int[N+1];

			for(int i=0;i<=N;i++){
				A[i] = 0;
			}

			for(int i=0;i<M;i++){
				x = scan.nextInt();
				y = scan.nextInt();

				A[x]++;
				A[y]++;
			}

			count = 0;

			if(M<2){
				System.out.println("YES");
			}else if(M==2){
				for(int i=1;i<=N;i++){
					if(A[i]==2){
						count++;
					}
				}

				if(count==1){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}