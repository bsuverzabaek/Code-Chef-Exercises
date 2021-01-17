import java.util.Scanner;

public class packCupcakes{
	public static void main(String[] args) {
		int T,N;
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

				if(N<=1 || N>100000000){
					System.out.println("N must be 2 <= N <= 10^8");
				}else{
					break;
				}
			}

			System.out.println((N/2)+1);

			T--;
		}
	}
}