//run as java -ea judgeDelay
import java.util.Scanner;

public class judgeDelay{
	public static void main(String[] args){
		int T,N,S,J,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			count = 0;

			while(N>0){
				S = scan.nextInt();
				J = scan.nextInt();

				assert(S>=1 && S<=J) : "S must be 1 <= S <= J";
				assert(J>=S && J<=300) : "J must be S <= J <= 300";

				if(J-S>5){
					count++;
				}

				N--;
			}

			System.out.println(count);

			T--;
		}
	}
}