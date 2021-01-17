import java.util.Scanner;
import java.lang.Math;

public class cielReceipt{
	public static void main(String[] args) {
		int T,p,ans;
		int[] P = new int[12];
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>5){
				System.out.println("T must be 1 <= T <= 5");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				p = scan.nextInt();

				if(p<0 || p>100000){
					System.out.println("p must be 1 <= p <= 10^5");
				}else{
					break;
				}
			}

			for(int i=0;i<12;i++){
				P[i] = (int) Math.pow(2,i);
			}

			ans = 0;

			for(int i=11;i>=0;i--){
				ans += p/P[i];
				p %= P[i];
			}

			System.out.println(ans);

			T--;
		}
	}
}