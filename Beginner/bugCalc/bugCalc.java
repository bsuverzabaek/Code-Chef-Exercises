//run as java -ea bugCalc
import java.util.Scanner;

public class bugCalc{
	public static void main(String[] args){
		int T,a,b,p,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			a = scan.nextInt();
			b = scan.nextInt();

			assert(a>=1 && a<=1000000000) : "a must be 1 <= a <= 10^9";
			assert(b>=1 && b<=1000000000) : "b must be 1 <= b <= 10^9";

			p = 1;
			ans = 0;

			while(a!=0 && b!=0){
				ans += (p*((a+b)%10));
				a /= 10;
				b /= 10;
				p *= 10;
			}

			if(a!=0){
				ans += (p*a);
			}

			if(b!=0){
				ans += (p*b);
			}

			System.out.println(ans);

			T--;
		}
	}
}