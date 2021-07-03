//run as java -ea secretRecipe
import java.util.Scanner;

public class secretRecipe{
	public static void main(String[] args){
		int T,X1,X2,X3,V1,V2;
		float s1,s2,t1,t2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			X1 = scan.nextInt();
			X2 = scan.nextInt();
			X3 = scan.nextInt();
			V1 = scan.nextInt();
			V2 = scan.nextInt();

			assert(X1<=100000) : "X1 must be <= 10^5";
			assert(X2<=100000) : "X2 must be <= 10^5";
			assert(X3<=100000) : "X3 must be <= 10^5";

			assert(X1<X3 && X3<X2) : "X1 must be < X3 and X3 must be < X2";

			assert(V1>=1 && V1<=100000) : "V1 must be 1 <= V1 <= 10^5";
			assert(V2>=1 && V2<=100000) : "V2 must be 1 <= V2 <= 10^5";

			s1 = X3-X1;
			s2 = X2-X3;

			t1 = s1/V1;
			t2 = s2/V2;

			if(t1<t2){
				System.out.println("Chef");
			}else if(t1>t2){
				System.out.println("Kefa");
			}else{
				System.out.println("Draw");
			}

			T--;
		}
	}
}