//run as java -ea giveAway
import java.util.Scanner;

public class giveAway{
	public static void main(String[] args){
		int T,l,r,k;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			l = scan.nextInt();
			r = scan.nextInt();
			k = scan.nextInt();

			assert(l>=1 && l<=r && r<=100) : "l and r must be 1 <= l <= r <= 100";
			assert(k>=1 && k<=100) : "k must be 1 <= k <= 100";

			if(l==r){
				System.out.println(1);
			}else{
				System.out.println(k);
			}

			T--;
		}
	}
}