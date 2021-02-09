//run as java -ea minDist
import java.util.Scanner;

public class minDist{
	public static void main(String[] args){
		int T;
		float DS,DT,D;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=2013) : "T must be 1 <= T <= 2013";

		while(T>0){
			DS = scan.nextFloat();
			DT = scan.nextFloat();
			D = scan.nextFloat();

			assert(DS>=1 && DS<=2013) : "DS must be 1 <= DS <= 2013";
			assert(DT>=1 && DT<=2013) : "DT must be 1 <= DT <= 2013";
			assert(D>=1 && D<=2013) : "D must be 1 <= D <= 2013";

			System.out.println(max(0,D-DS-DT,DS-DT-D,DT-DS-D));

			T--;
		}
	}

	public static float max(float a,float b,float c,float d){
		if(a>b && a>c && a>d){
			return a;
		}else if(b>a && b>c && b>d){
			return b;
		}else if(c>a && c>b && c>d){
			return c;
		}else{
			return d;
		}
	}
}