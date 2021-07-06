//run as java -ea bearLadder
import java.util.Scanner;

public class bearLadder{
	public static void main(String[] args){
		int Q,a,b,s,g;
		Scanner scan = new Scanner(System.in);

		Q = scan.nextInt();
		assert(Q>=1 && Q<=1000) : "Q must be 1 <= Q <= 1000";

		while(Q>0){
			a = scan.nextInt();
			b = scan.nextInt();

			assert(a>=1 && a<=1000000000) : "a must be 1 <= a <= 10^9";
			assert(b>=1 && b<=1000000000) : "b must be 1 <= b <= 10^9";
			assert(a!=b) : "a must not equal b";

			s = (a<b)?a:b;
			g = (a>b)?a:b;

			if(s%2==0 && g%2==0 && diff(a,b)==2){
				System.out.println("YES");
			}else if(s%2==1 && g%2==1 && diff(a,b)==2){
				System.out.println("YES");
			}else if(s%2==1 && g%2==0 && diff(a,b)==1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			Q--;
		}
	}
	public static int diff(int a,int b){
		return (a>b)?a-b:b-a;
	}
}