import java.util.Scanner;

public class fitTri{
	public static void main(String[] args) {
		int T,B;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 10^3");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				System.out.print("Input Base B: ");
				B = scan.nextInt();

				if(B<=0 || B>10000){
					System.out.println("B must be 1 <= B <= 10^4");
				}else{
					break;
				}
			}

			B /= 2;

			System.out.println((B*(B-1))/2);

			T--;
		}
	}
}