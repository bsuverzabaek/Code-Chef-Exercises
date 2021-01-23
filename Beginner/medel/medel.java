//run as java -ea medel
import java.util.Scanner;

public class medel{
	public static void main(String[] args) {
		int T,N,max,min,a=0,b=0;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=74) : "T must be 1 <= T <= 74";

		while(T>0){
			N = scan.nextInt();
			assert(N>=3 && N<=19) : "N must be 3 <= N <= 19";

			int[] A = new int[N];

			max = 0;
			min = 10000;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=109) : "A["+i+"] must be 1 <= A[i] <= 109";

				if(min>A[i]){
					min = A[i];
					a = i;
				}
				if(max<A[i]){
					max = A[i];
					b = i;
				}
			}

			if(a<b){
				System.out.println(min + " " + max);
			}else{
				System.out.println(max + " " + min);
			}

			T--;
		}
	}
}