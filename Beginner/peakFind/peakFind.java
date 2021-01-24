//run as java -ea peakFind
import java.util.Scanner;

public class peakFind{
	public static void main(String[] args){
		int T,N,max,i;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 100000";

			max = -1;

			for(int j=0;j<N;j++){
				i = scan.nextInt();
				assert(i>=0 && i<=1000000000) : "Height must be 0 <= height <= 10^9";

				if(i>max){
					max = i;
				}
			}

			System.out.println(max);

			T--;
		}
	}
}