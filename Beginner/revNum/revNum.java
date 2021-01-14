import java.util.Scanner;

public class revNum{
	public static void main(String[] args) {
		int T,N,rem,ans;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 1000");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>1000000){
					System.out.println("N must be 1 <= N <= 1000000");
				}else{
					break;
				}
			}

			ans = 0;

			while(N>0){
				rem = N%10;
				ans = rem+ans*10;
				N /= 10;
			}

			System.out.println(ans);

			T--;
		}
	}
}