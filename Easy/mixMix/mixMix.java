//run as java -ea mixMix
import java.util.Scanner;
import java.lang.Math;

public class mixMix{
	public static void main(String[] args){
		int T,N,Z1,Z2,flag,x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			N = scan.nextInt();
			Z1 = scan.nextInt();
			Z2 = scan.nextInt();

			assert(N>=1 && N<=50) : "N must be 1 <= N <= 50";
			assert(Math.abs(Z1)<=1000000000) : "Abs of Z1 must be abs(Z1)<=10^9";
			assert(Math.abs(Z2)<=1000000000) : "Abs of Z2 must be abs(Z2)<=10^9";

			int[] A = new int[N];
			flag = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(Math.abs(A[i])<=1000000000) : "Abs of each element must be abs(A[i])<=10^9";

				if((-A[i]==Z1) || (-A[i]==Z2) || (A[i]==Z1) || (A[i]==Z2)){
					flag = 1;
				}
			}

			if(flag==1){
				System.out.println(1);
			}else{
				for(int i=0;i<N;i++){
					x = -A[i];
					flag = 0;

					for(int j=0;j<N;j++){
						if((x+A[j]==Z1) || (x-A[j]==Z1) || (x+A[j]==Z2) || (x-A[j]==Z2)){
							flag = 1;
						}
					}

					if(flag==0){
						break;
					}

					x = A[i];
					flag = 0;

					for(int j=0;j<N;j++){
						if((x+A[j]==Z1) || (x-A[j]==Z1) || (x+A[j]==Z2) || (x-A[j]==Z2)){
							flag = 1;
						}
					}

					if(flag==0){
						break;
					}
				}

				if(flag==0){
					System.out.println(0);
				}else{
					System.out.println(2);
				}
			}

			T--;
		}
	}
}