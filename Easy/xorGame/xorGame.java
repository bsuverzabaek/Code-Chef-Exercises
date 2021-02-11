// run as java -ea xorGame
import java.util.Scanner;

public class xorGame{
	public static void main(String[] args){
		int T,N,xor,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000 && N%2!=0) : "N must be 1 <= N <= 10^5 and odd";

			int[] A = new int[N];
			int[] B = new int[N];
			int[] C = new int[N];
			int[] count = new int[100000];

			for(int i=0;i<100000;i++){
				count[i] = 0;
			}

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=0 && A[i]<=1000000) : "A["+i+"] must be 0 <= A[i] <= 10^6";
			}

			for(int i=0;i<N;i++){
				B[i] = scan.nextInt();
				assert(B[i]>=0 && B[i]<=1000000) : "B["+i+"] must be 0 <= B[i] <= 10^6";
				count[B[i]]++;
			}

			xor = 0;

			for(int i=0;i<N;i++){
				xor ^= A[i];
			}

			for(int i=0;i<N;i++){
				xor ^= B[i];
			}

			flag = 0;

			for(int i=0;i<N;i++){
				if(count[xor^A[i]]>0){
					count[xor^A[i]]--;
					C[i] = xor^A[i];
				}else{
					flag = 1;
					break;
				}
			}

			if(flag==0){
				for(int i=0;i<N;i++){
					System.out.print(C[i] + " ");
				}
				System.out.println();
			}else{
				System.out.println(-1);
			}

			T--;
		}
	}
}