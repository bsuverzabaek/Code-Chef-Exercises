//run as java -ea floorDivision
import java.util.Scanner;

public class floorDivision{
	public static void main(String[] args){
		int T,N;
		long x,d;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		int[] A = {0,1,2,2,3,3,0};

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			d = 0;

			for(int i=0;i<N;i++){
				x = scan.nextLong();
				assert(x>=1 && x<=1000000000000000000L) : "A["+i+"] must be 1 <= A[i] <= 10^18";

				while(x>11){
					x /= 12;
				}

				d ^= A[(int)x];
			}

			if(d!=0){
				System.out.println("Henry");
			}else{
				System.out.println("Derek");
			}

			T--;
		}
	}
}