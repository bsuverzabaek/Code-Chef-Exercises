import java.util.Scanner;

public class smallFact{
	public static void main(String[] args) {
		int T,n,ans;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100){
				System.out.println("T must be 1 <= T <= 100");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				n = scan.nextInt();

				if(n<=0 || n>100){
					System.out.println("n must be 1 <= n <= 100");
				}else{
					break;
				}
			}

			ans = n;

			for(int i=1;i<n;i++){
				ans *= i;
			}

			System.out.println(ans);

			T--;
		}
	}
}