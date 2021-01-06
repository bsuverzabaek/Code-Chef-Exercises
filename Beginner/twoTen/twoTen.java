import java.util.Scanner;

public class twoTen{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 1000");
			}else{
				break;
			}
		}

		while(T>0){
			int X;

			while(true){
				System.out.print("Input X: ");
				X = scan.nextInt();

				if(X<0 || X>1000000000){
					System.out.println("X must be 0 <= X <= 10^9");
				}else{
					break;
				}
			}

			if(X%10==0){
				System.out.println("0");
			}else if(X%5==0){
				System.out.println("1");
			}else{
				System.out.println("-1");
			}

			T--;
		}
	}
}