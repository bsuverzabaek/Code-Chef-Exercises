//run as java -ea yetAnother
import java.util.Scanner;

public class yetAnother{
	public static void main(String[] args){
		int T;
		long R,B,P,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			R = scan.nextLong();
			B = scan.nextLong();
			P = scan.nextLong();

			assert(R>=1 && R<=100000) : "R must be 1 <= R <= 100000";
			assert(B>=1 && B<=100000) : "B must be 1 <= B <= 100000";
			assert(P>=0 && P<=R+B) : "P must be 0 <= P <= R+B";

			ans = R+B-P;
			
			System.out.printf("%.12f",(double) (R*P+B*ans)/(R+B));
			System.out.println();

			T--;
		}
	}
}