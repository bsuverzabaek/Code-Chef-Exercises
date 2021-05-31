//run as java -ea programCalc
import java.util.Scanner;

public class programCalc{
	public static void main(String[] args){
		int A,B;
		char C;
		Scanner scan = new Scanner(System.in);

		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.next().charAt(0);

		assert(A>=-1000 && A<=1000) : "A must be -1000 <= A <= 1000";
		assert(B>=-1000 && B<=1000) : "B must be -1000 <= B <= 1000";
		assert(B!=0) : "B must not equal 0";
		assert(C=='+' || C=='-' || C=='*' || C=='/') : "C must be +, -, *, or /";

		if(C=='+'){
			System.out.println(A+B);
		}else if(C=='-'){
			System.out.println(A-B);
		}else if(C=='*'){
			System.out.println(A*B);
		}else{
			System.out.println((double)A/(double)B);
		}
	}
}