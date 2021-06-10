//run as java -ea sticks
import java.util.Scanner;
import java.util.Arrays;

public class sticks{
	public static void main(String[] args){
		int T,N,sumN,j;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 10^3";

			sumN += N;

			if(T==1){
				assert(sumN>=1 && sumN<=1000) : "Sum of N must be 1 <= sumN <= 10^3";
			}

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000) : "A["+i+"] must be 1 <= A[i] <= 10^3";
			}

			Arrays.sort(A);

			int[] B = new int[3];
			j = 0;

			for(int i=0;i<N-1;i++){
				if(A[i]==A[i+1]){
					j++;
					B[j] = A[i];
					i++;
				}

				if(j==2){
					break;
				}
			}

			if(j!=2){
				System.out.println(-1);
			}else{
				System.out.println(B[1]*B[2]);
			}

			T--;
		}
	}
}