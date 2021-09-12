//run as java -ea bestBox
import java.util.Scanner;
import java.lang.Math;

public class bestBox{
	public static void main(String[] args){
		int T,P,S;
		double h,v;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			P = scan.nextInt();
			S = scan.nextInt();

			assert(P>=1 && P<=40000) : "P must be 1 <= P <= 40000";
			assert(S>=1 && S<=20000) : "S must be 1 <= S <= 20000";

			h = (P-Math.sqrt(P*P-24*S))/12;
			v = (S/2-h*(P/4-h))*h;

			System.out.printf("%.2f",v);
			System.out.println();

			T--;
		}
	}
}