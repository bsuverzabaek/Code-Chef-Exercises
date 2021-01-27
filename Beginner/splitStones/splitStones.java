//run as java -ea splitStones
import java.util.Scanner;
import java.util.Arrays;

public class splitStones{
	public static void main(String[] args){
		int T,a,b,c,x,y;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();

			assert(a>=1 && a<=10000000) : "a must be 1 <= a <= 10^9";
			assert(b>=1 && b<=10000000) : "b must be 1 <= b <= 10^9";
			assert(c>=1 && c<=10000000) : "c must be 1 <= c <= 10^9";
			assert(x>=1 && x<=10000000) : "x must be 1 <= x <= 10^9";
			assert(y>=1 && y<=10000000) : "y must be 1 <= y <= 10^9";

			if(x>y){
				int temp = x;
				x = y;
				y = temp;
			}

			int[] d = {a,b,c};
			Arrays.sort(d);

			if(d[0]+d[1]+d[2]!=x+y || d[0]>x || d[1]>y){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}

			T--;
		}
	}
}