import java.util.Scanner;

public class helpChef{
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

				if(N<-20 || N>20){
					System.out.println("N must be -20 <= N <= 20");
				}else{
					break;
				}
			}

			if(N<10){
				System.out.println("Thanks for helping Chef!");
			}else{
				System.out.println("-1");
			}

			T--;
		}
	}
}