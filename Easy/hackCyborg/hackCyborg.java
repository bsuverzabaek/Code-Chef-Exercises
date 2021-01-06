import java.util.Scanner;

public class hackCyborg{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<=0 || T>100000){
				System.out.println("T must be 1 <= T <= 10^5");
			}else{
				break;
			}
		}

		while(T>0){
			int N;
			int M;

			while(true){
				N = scan.nextInt();
				M = scan.nextInt();

				if(N<=0 || N>100000){
					System.out.println("N must be 1 <= N <= 10^5");
				}else if(M<=0 || M>100000){
					System.out.println("M must be 1 <= M <= 10^5");
				}else{
					break;
				}
			}

			int [] A = new int[N];
			int [] B = new int[M];

			for(int i=0;i<N;i++){
				while(true){
					A[i] = scan.nextInt();
					if(A[i]<=0 || A[i]>1000000000){
						System.out.println("A["+i+"] must be 1 <= A[i] <= 10^9");
					}else{
						break;
					}
				}
			}

			for(int i=0;i<M;i++){
				while(true){
					B[i] = scan.nextInt();
					if(B[i]<=0 || B[i]>N){
						System.out.println("B["+i+"] must be 1 <= B[i] <= N");
					}else{
						break;
					}
				}
			}

			int sum = 0;

			for(int i=0;i<M;i++){
				for(int j=i;j<M;j++){
					sum += rangeMin(A,B[i]-1,B[j]-1);
				}
			}

			System.out.println(sum);

			T--;
		}
	}

	public static int rangeMin(int[] A, int a, int b){
		int min = 1000000000;

		for(int i=a;i<=b;i++){
			if(A[i]<min){
				min = A[i];
			}
		}

		return min;
	}
}