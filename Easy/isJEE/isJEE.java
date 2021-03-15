//run as java -ea isJEE
import java.util.Scanner;
import java.lang.Math;

public class isJEE{
	public static void main(String[] args){
		int T;
		double b,c,L,R,x1,x2,f1,f2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		while(T>0){
			b = scan.nextDouble();
			c = scan.nextDouble();

			assert(b>=1 && b<=20) : "b must be 1 <= b <= 20";
			assert(c>=1 && c<=20) : "c must be 1 <= c <= 20";

			L = 0;
			R = Math.PI/2.0;

			while(R-L>=1e-6){
				x1 = L+(R-L)/3.0;
				x2 = R-(R-L)/3.0;

				f1 = value(x1,b,c);
				f2 = value(x2,b,c);

				if(f1>f2){
					L = x1;
				}else{
					R = x2;
				}
			}

			System.out.println(String.format("%.10f",value(L,b,c)));

			T--;
		}
	}

	public static double value(double x,double b,double c){
		return (x*x+b*x+c)/Math.sin(x);
	}
}