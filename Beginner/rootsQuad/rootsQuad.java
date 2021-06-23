//run as java -ea rootsQuad
import java.util.Scanner;
import java.lang.Math;

public class rootsQuad{
	public static void main(String[] args){
		int A,B,C,d;
		double x1,x2;
		Scanner scan = new Scanner(System.in);

		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();

		assert(A>=-1000 && A<=1000) : "A must be -1000 <= A <= 1000";
		assert(B>=-1000 && B<=1000) : "B must be -1000 <= B <= 1000";
		assert(C>=-1000 && C<=1000) : "C must be -1000 <= C <= 1000";

		d = (B*B)-(4*A*C);

		x1 = (-B+Math.sqrt(d))/(2*A);
		x2 = (-B-Math.sqrt(d))/(2*A);

		System.out.printf("%.0f",x1);
		System.out.println();

		System.out.printf("%.0f",x2);
		System.out.println();
	}
}