//run as java -ea compressList
import java.util.Scanner;

public class compressList{
	public static void main(String[] args){
		int T,N,j,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000) : "A["+i+"] must be 1 <= A[i] <= 1000";

				if(i>0){
					assert(A[i]>A[i-1]) : "A must be sorted";
				}
			}

			j = 0;
			System.out.print(A[0]);

			while(j<N-1){
				count = 0;

				while(j<N-1){
					if(A[j+1]!=A[j]+1){
						break;
					}

					j++;
					count++;
				}

				if(count==0){
					j++;
				}

				if(count>=2){
					System.out.print("..."+A[j]);
				}else{
					System.out.print(","+A[j]);
				}
			}

			System.out.println();

			T--; 
		}
	}
}