//run as java -ea templeLand
import java.util.Scanner;

public class templeLand{
	public static void main(String[] args){
		int S,N,flag,count;
		Scanner scan = new Scanner(System.in);

		S = scan.nextInt();
		assert(S>=1 && S<=100) : "S must be 1 <= S <= 100";

		while(S>0){
			N = scan.nextInt();
			assert(N>=3 && N<=100) : "N must be 3 <= N <= 100";

			int[] H = new int[N];

			if(N%2==0){
				for(int i=0;i<N;i++){
					H[i] = scan.nextInt();
					assert(H[i]>=1 && H[i]<=100) : "H["+i+"] must be 1 <= H[i] <= 100";
				}

				System.out.println("no");
			}else{
				for(int i=0;i<N;i++){
					H[i] = scan.nextInt();
					assert(H[i]>=1 && H[i]<=100) : "H["+i+"] must be 1 <= H[i] <= 100";
				}

				flag = 0;

				for(int i=0;i<N/2;i++){
					if(H[i+1]-H[i]==1){
						flag = 1;
					}else{
						flag = 0;
						break;
					}
				}

				count = 0;

				for(int i=0;i<N/2;i++){
					if(H[i]==H[N-i-1]){
						count++;
					}
				}

				if(flag==1 && count==N/2 && H[0]==1){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}

			S--;
		}
	}
}