//run as java -ea iplRCB
import java.util.Scanner;

public class iplRCB{
	public static void main(String[] args){
		int T,X,Y;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10000";

		while(T>0){
			X = scan.nextInt();
			Y = scan.nextInt();

			assert(X>=1 && X<=100) : "X must be 1 <= X <= 100";
			assert(Y>=1 && Y<=100) : "Y must be 1 <= Y <= 100";
			assert(X>=1 && X<=2*Y) : "X must be 1 <= X <= 2*Y";

			if(X>Y){
				System.out.println(X-Y);
			}else if(X<=Y){
				System.out.println(0);
			}

			T--;
		}
	}
}