import java.util.Scanner;

public class chefNote{
	public static void main(String[] args) {
		int T,X,Y,K,N;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100000){
				System.out.println("T must be 1 <= T <= 10^5");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				X = scan.nextInt();
				Y = scan.nextInt();
				K = scan.nextInt();
				N = scan.nextInt();

				if(Y<=0 || Y>X){
					System.out.println("Y must be 1 <= Y < X");
				}else if(X<Y || X>1000){
					System.out.println("X must be Y < X <= 10^3");
				}else if(K<=0 || K>1000){
					System.out.println("K must be 1 <= K <= 10^3");
				}else if(N<=0 || N>100000){
					System.out.println("N must be 1 <= N <= 10^5");
				}else{
					break;
				}
			}

			int[] P = new int[N];
			int[] C = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					P[i] = scan.nextInt();
					C[i] = scan.nextInt();

					if(P[i]<=0 || P[i]>1000){
						System.out.println("P["+i+"] must be 1 <= P[i] <= 10^3");
					}else if(C[i]<=0 || C[i]>1000){
						System.out.println("C["+i+"] must be 1 <= C[i] <= 10^3");
					}else{
						break;
					}
				}
			}

			X -= Y;

			for(int i=0;i<N;i++){
				if(P[i]>=X && K>=C[i]){
					System.out.println("LuckyChef");
					break;
				}else if(i==N-1){
					if(X>P[i] || C[i]>K){
						System.out.println("UnluckyChef");
					}
				}
			}

			T--;
		}
	}
}