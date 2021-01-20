import java.util.Scanner;

public class cutRecipe{
	public static void main(String[] args) {
		int T,N,min;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100){
				System.out.println("T must be 1 <= T <= 100");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=1 || N>50){
					System.out.println("N must be 2 <= N <= 50");
				}else{
					break;
				}
			}

			int[] q = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					q[i] = scan.nextInt();

					if(q[i]<=0 || q[i]>1000){
						System.out.println("q["+i+"] must be 1 <= q[i] <= 1000");
					}else{
						break;
					}
				}
			}

			min = q[0];

			for(int i=0;i<N;i++){
				min = gcd(min,q[i]);
			}

			for(int i=0;i<N;i++){
				System.out.print(q[i]/min + " ");
			}
			System.out.println();

			T--;
		}
	}

	public static int gcd(int A,int B){
		if(A==0){
			return B;
		}else if(B==0){
			return A;
		}else{
			int rem = A%B;
			A = B;
			B = rem;
			return gcd(A,B);
		}
	}
}