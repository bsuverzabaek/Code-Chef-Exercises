//run as java -ea validPair
import java.util.Scanner;

public class validPair{
	public static void main(String[] args){
		int A,B,C;
		Scanner scan = new Scanner(System.in);

		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();

		assert(A>=1 && A<=10) : "A must be 1 <= A <= 10";
		assert(B>=1 && B<=10) : "B must be 1 <= B <= 10";
		assert(C>=1 && C<=10) : "C must be 1 <= C <= 10";

		if(A==B || A==C || B==C){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}