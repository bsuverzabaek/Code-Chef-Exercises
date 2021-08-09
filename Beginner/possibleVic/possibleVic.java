//run as java -ea possibleVic
import java.util.Scanner;

public class possibleVic{
	public static void main(String[] args){
		int R,O,C;
		Scanner scan = new Scanner(System.in);

		R = scan.nextInt();
		O = scan.nextInt();
		C = scan.nextInt();

		assert(C>=0 && C<=R && R <= 720) : "C and R must be 0 <= C <= R <= 720";
		assert(O>=1 && O<=19) : "O must be 1 <= O <= 19";
		assert(C<=36*O) : "C must be 0 <= C <= 36*O";

		if((20-O)*36>(R-C)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}