import java.util.Scanner;

public class luckyFour{
	public static void main(String[] args) {
		int T,N,count;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100000){
				System.out.println("T must be 1 <= T <= 10^5");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<0 || N>1000000000){
					System.out.println("N must be 0 <= N <= 10^9");
				}else{
					break;
				}
			}

			count = 0;

			while(N>0){
				if(N%10==4){
					count++;
				}

				N /= 10;
			}

			System.out.println(count);

			T--;
		}
	}
}