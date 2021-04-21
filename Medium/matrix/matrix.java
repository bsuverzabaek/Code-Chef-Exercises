//run as java -ea matrix
import java.util.Scanner;

public class matrix{
	public static void main(String[] args){
		int M,N;
		String c;
		long sum;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		assert(N>=1 && N<=2000) : "N must be 1 <= N <= 2000";
		assert(M>=1 && M<=2000) : "M must be 1 <= M <= 2000";

		int[][] A = new int[2001][2001];
		sum = 0;

		for(int i=0;i<N;i++){
			c = scan.next();
			for(int j=0;j<M;j++){
				for(int k=0;k<c.length();k++){
					assert(c.charAt(k)=='0' || c.charAt(k)=='1') : "Each character must be 0 or 1";
				}

				A[i][j] = c.charAt(j)-'0';

				if(i!=0 && j!=0){
					if(A[i][j]==1){
						A[i][j] += min(A[i-1][j],A[i-1][j-1]);
					}
				}

				sum += A[i][j];
			}
		}

		System.out.println(sum);
	}

	public static int min(int a,int b){
		return (a<b?a:b);
	}
}