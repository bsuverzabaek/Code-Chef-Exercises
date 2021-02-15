//run as java -ea reachPoint
import java.util.Scanner;
import java.lang.Math;

public class reachPoint{
	public static void main(String[] args){
		int T,X,Y,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			X = scan.nextInt();
			Y = scan.nextInt();

			assert(X>=-1000000000 && X<=1000000000) : "X must be -10^9 <= X <= 10^9";
			assert(Y>=-1000000000 && Y<=1000000000) : "Y must be -10^9 <= Y <= 10^9";

			X = Math.abs(X);
			Y = Math.abs(Y);
			ans = min(X,Y)*2;

			if(Y>X){
				Y -= X;
				ans += (Y/2*4);

				if(Y%2!=0){
					ans++;
				}
			}else{
				X -= Y;
				ans += (X/2*4);

				if(X%2!=0){
					ans += 3;
				}
			}

			System.out.println(ans);

			T--;
		}
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}