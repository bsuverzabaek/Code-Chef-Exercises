//run as java -ea breakBricks
import java.util.Scanner;

public class breakBricks{
	public static void main(String[] args){
		int T,S,W1,W2,W3;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=64) : "T must be 1 <= T <= 64";

		while(T>0){
			S = scan.nextInt();
			W1 = scan.nextInt();
			W2 = scan.nextInt();
			W3 = scan.nextInt();

			assert(S>=1 && S<=8) : "S must be 1 <= S <= 8";
			assert((W1>=1 && W1<=2) && (W2>=1 && W2<=2) && (W3>=1 && W3<=2)) : "Each width must be 1 <= W <= 2";

			if(S>=W1+W2+W3){
				System.out.println("1");
			}else if(S>=W1+W2 || S>=W2+W3){
				System.out.println("2");
			}else{
				System.out.println("3");
			}

			T--;
		}
	}
}