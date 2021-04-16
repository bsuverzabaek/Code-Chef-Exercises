//run as java -ea findPoint
import java.util.Scanner;
import java.lang.Math;

public class findPoint{
	public static void main(String[] args){
		int T,out;
		double R,K;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			R = scan.nextDouble();
			K = scan.nextDouble();

			assert(R>=2 && R<=1000000000) : "R must be 2 <= R <= 10^9";
			assert(K>=1 && K<=99) : "K must be 1 <= K <= 99";

			out = find_Point(R,K);

			T--;
		}
	}

	public static int find_Point(double R,double K){
		double inner = (int)Math.sqrt(2*R-1);

		if(R-Math.sqrt((R-1)*(R-1)+inner*inner)<=K/100){
			System.out.printf("%.0f %.0f",(R-1),inner);
			System.out.println();
			return 0;
		}

		System.out.println("-1");
		return 0;
	}
}