//run as java -ea pizzaParty
import java.util.Scanner;

public class pizzaParty{
	public static void main(String[] args){
		int M,N,temp,ans,x;
		Scanner scan = new Scanner(System.in);

		M = scan.nextInt();
		N = scan.nextInt();

		assert(M>=1 && M<=200000) : "M must be 1 <= M <= 2*10^5";
		assert(N>=1 && N<=200000) : "N must be 1 <= N <= 2*10^5";

		int[] A = new int[M];

		for(int i=0;i<M;i++){
			A[i] = scan.nextInt();
			assert(A[i]>=1 && A[i]<=200000) : "A["+i+"] must be 1 <= A[i] <= 1*10^5";
		}

		ans = 0;
		x = 0;

		for(int i=0;i<M;i++){
			for(int j=0;j<M-i-1;j++){
				if(A[j]>A[j+1]){
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}

				if(j==M-i-2){
					if(A[j+1]<=N && N!=0){
						ans += ((A[j+1]*(A[j+1]+1))/2)+1;
						N -= A[j+1];
					}else if(A[j+1]>N && N!=0){
						ans += ((N*(N+1))/2)+1;
						N = 0;
					}

					if(j==0 && A[j]<=N && N!=0){
						ans += ((A[j]*(A[j]+1))/2)+1;
						N -= A[j];
					}else if(j==0 && A[j]>N && N!=0){
						ans += ((N*(N+1))/2)+1;
						N = 0;
					}

					if(N==0){
						x = j+1;
						break;
					}
				}
			}

			if(N==0){
				break;
			}
		}

		System.out.println(ans+x);
	}
}