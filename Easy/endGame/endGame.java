//run as java -ea endGame
import java.util.Scanner;

public class endGame{
	public static void main(String[] args){
		int T;
		long D,H,temp,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			D = scan.nextLong();
			H = scan.nextLong();

			assert(D>=0 && D<=100000) : "D must be 0 <= D <= 10^5";
			assert(H>=0 && H<=100000) : "H must be 0 <= H <= 10^5";

			if(D>H){
				temp = D;
				D = H;
				H = temp;
			}

			if(D==0 && H!=0){
				System.out.println(-1);
			}else if(D==0 && H==0){
				System.out.println(0);
			}else if(D==H){
				System.out.println(D);
			}else{
				ans = 0;

				while(D<H-D){
					D *= 2;
					ans++;
				}

				ans += H;
				ans++;

				System.out.println(ans);
			}

			T--;
		}
	}
}