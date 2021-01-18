import java.util.Scanner;

public class smallNotes{
	public static void main(String[] args) {
		int T,N,count;
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

			count = 0;

			count += N/100;
			N %= 100;
			count += N/50;
			N %= 50;
			count += N/10;
			N %= 10;
			count += N/5;
			N %= 5;
			count += N/2;
			N %= 2;
			count += N/1;

			System.out.println(count);

			T--;
		}
	}
}