//run as java -ea heavenEarth
import java.util.Scanner;
import java.lang.Math;

public class heavenEarth{
	public static void main(String[] args){
		int T,N;
		float V1,V2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			V1 = scan.nextFloat();
			V2 = scan.nextFloat();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";
			assert(V1>=1 && V1<=100) : "V1 must be 1 <= V1 <= 100";
			assert(V2>=1 && V2<=100) : "V2 must be 1 <= V2 <= 100";

			if(V2<Math.sqrt(2)*V1){
				System.out.println("Stairs");
			}else{
				System.out.println("Elevator");
			}

			T--;
		}	
	}
}