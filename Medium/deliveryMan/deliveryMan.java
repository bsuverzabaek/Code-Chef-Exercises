import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class deliveryMan{
	public static void main(String[] args) {
		int N,X,Y,maxTip;
		Scanner scan = new Scanner(System.in);

		while(true){
			N = scan.nextInt();
			X = scan.nextInt();
			Y = scan.nextInt();

			if(N<=0 || N>100000){
				System.out.println("N must be 1 <= N <= 10^5");
			}else if(X<=0 || X>N){
				System.out.println("X must be 1 <= X <= N");
			}else if(Y<=0 || Y>N){
				System.out.println("Y must be 1 <= Y <= N");
			}else if((X+Y)<N){
				System.out.println("X + Y must be >= N");
			}else{
				break;
			}
		}

		int[] A = new int[N];
		int[] B = new int[N];
		Integer[] diff = new Integer[N];

		for(int i=0;i<N;i++){
			while(true){
				A[i] = scan.nextInt();

				if(A[i]<=0 || A[i]>10000){
					System.out.println("A["+i+"] must be 1 <= A[i] <= 1000");
				}else{
					break;
				}
			}
		}

		for(int i=0;i<N;i++){
			while(true){
				B[i] = scan.nextInt();

				if(B[i]<=0 || B[i]>10000){
					System.out.println("B["+i+"] must be 1 <= B[i] <= 1000");
				}else{
					break;
				}
			}

			diff[i] = B[i] - A[i];
		}

		Arrays.sort(diff,Collections.reverseOrder());

		maxTip = 0;

		for(int i=0;i<N;i++){
			maxTip += A[i];
		}

		for(int i=0;i<N-X;i++){
			maxTip += diff[i];
		}

		for(int i=N-X;i<Y;i++){
			maxTip = max(maxTip+diff[i],maxTip);
		}

		System.out.println(maxTip);
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}