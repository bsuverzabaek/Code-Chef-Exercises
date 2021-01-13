import java.util.Scanner;

public class carVans{
	public static void main(String[] args) {
		int T,N;
		int x,front,ans;
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
				N = scan.nextInt();

				if(N<=0 || N>10000){
					System.out.println("N must be 1 <= N <= 10000");
				}else{
					break;
				}
			}

			x = scan.nextInt();
			front = x;
			ans = 1;

			for(int i=0;i<N-1;i++){
				x = scan.nextInt();
				if(x<front){
					front = x;
					ans++;
				}
			}

			System.out.println(ans);

			T--;
		}
	}
}