//run as java -ea orderSoldiers
import java.util.Scanner;

public class orderSoldiers{
	public static void main(String[] args){
		int T,N,temp;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T<=50) : "T must be <= 50";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=200000) : "N must be 1 <= N <= 200000";

			int[] w = new int[N];
			int[] num = new int[N];

			for(int i=0;i<N;i++){
				w[i] = scan.nextInt();
				num[i] = i+1;
			}

			for(int i=N-1;i>=0;i--){
				temp = num[i-w[i]];

				for(int j=i-w[i];j<i;j++){
					num[j] = num[j+1];
				}

				num[i] = temp;
			}

			for(int i=0;i<N;i++){
				System.out.print(num[i] + " ");
			}

			System.out.println();

			T--;
		}
	}
}