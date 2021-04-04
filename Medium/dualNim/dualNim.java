//run as java -ea dualNim
import java.util.Scanner;

public class dualNim{
	public static void main(String[] args){
		int T,N,a,x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=500) : "N must be 1 <= N <= 500";

			x = 0;

			for(int i=0;i<N;i++){
				a = scan.nextInt();
				assert(a>=1 && a<=500) : "a["+i+"] must be 1 <= a[i] <= 500";
				x ^= a;
			}

			if(x==0 || N%2==0){
				System.out.println("First");
			}else{
				System.out.println("Second");
			}

			T--;
		}
	}
}