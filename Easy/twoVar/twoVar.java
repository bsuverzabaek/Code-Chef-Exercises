//run as java -ea twoVar
import java.util.Scanner;
import java.lang.Math;

public class twoVar{
	public static void main(String[] args){
		int T;
		long xf,count,X,Y,P;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			xf = scan.nextLong();
			assert(xf>=1 && xf<=1000000000) : "xf must be 1 <= xf <= 10^9";

			count = 0;
			X = 1;
			Y = 1;
			P = 1;

			while(true){
				if(X==xf){
					System.out.println(count+1);
					break;
				}

				if(X>xf){
					System.out.println(count);
					break;
				}

				count++;
				P = (long) Math.sqrt(Y) + 1;
				X = P;
				Y += P*P;
			}

			T--;
		}
	}
}