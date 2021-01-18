import java.util.Scanner;

public class blockGame{
	public static void main(String[] args) {
		int T,N;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>20){
				System.out.println("T must be 1 <= T <= 20");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>20000){
					System.out.println("N must be 1 <= N <= 20000");
				}else{
					break;
				}
			}

			if(N==revFunc(N)){
				System.out.println("wins");
			}else{
				System.out.println("loses");
			}

			T--;
		}
	}

	public static int revFunc(int n){
		int ans = 0;

		while(n>0){
			int rem = n%10;
			ans = rem+ans*10;
			n /= 10;
		}

		return ans;
	}
}