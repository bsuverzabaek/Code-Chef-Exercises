//run as java -ea deadlySin
import java.util.Scanner;

public class deadlySin{
	public static void main(String[] args){
		int T,X,Y,temp;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		while(T>0){
			X = scan.nextInt();
			Y = scan.nextInt();

			assert(X>=0 && X<=1000000000) : "X must be 0 <= X <= 10^9";
			assert(Y>=0 && Y<=1000000000) : "Y must be 0 <= Y <= 10^9";

			if(X==0){
				System.out.println(Y);
			}else if(Y==0){
				System.out.println(X);
			}else{
				if(Y<X){
					temp = Y;
					Y = X;
					X = temp;
				}

				while(Y%X!=0){
					temp = Y%X;
					Y = X;
					X = temp;
				}

				System.out.println(2*X);
			}

			T--;
		}
	}
}