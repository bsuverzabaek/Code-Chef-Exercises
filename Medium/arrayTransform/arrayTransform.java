//run as java -ea arrayTransform
import java.util.Scanner;

public class arrayTransform{
	public static void main(String[] args){
		int T,n,K,rem1,rem2,remCount1,remCount2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			n = scan.nextInt();
			K = scan.nextInt();

			assert(n>=2 && n<=100) : "n must be 2 <= n <= 100";
			assert(K>=1 && K<=10) : "K must be 1 <= K <= 10";

			int[] A = new int[n];

			for(int i=0;i<n;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=0 && A[i]<=1000) : "A["+i+"] must be 0 <= A[i] <= 1000";
			}

			if(n==2){
				System.out.println("YES");
			}else{
				rem1 = A[0]%(K+1);
				rem2 = -1;
				remCount1 = 1;
				remCount2 = 0;

				int i;

				for(i=1;i<n;i++){
					if(A[i]%(K+1)!=rem1){
						if(rem2!=-1){
							if(A[i]%(K+1)==rem2){
								remCount2++;
							}else{
								break;
							}
						}else{
							rem2 = A[i]%(K+1);
							remCount2 = 1;
						}
					}else{
						remCount1++;
					}
				}

				if(i<n){
					System.out.println("NO");
				}else{
					if(remCount1==n-1 || remCount2==n-1 || remCount1==n){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}
			}

			T--;
		}
	}
}