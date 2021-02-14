//run as java -ea gradeSteel
import java.util.Scanner;

public class gradeSteel{
	public static void main(String[] args){
		int T,hard,tensile;
		float carbon;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			hard = scan.nextInt();
			carbon = scan.nextFloat();
			tensile = scan.nextInt();

			assert(hard>=0 && hard<=10000) : "Hardness must be 1 <= hardness <= 10000";
			assert(carbon>=0 && carbon<=10000) : "Carbon content must be 1 <= carbon <= 10000";
			assert(tensile>=0 && tensile<=10000) : "Tensile strength must be 1 <= tensile <= 10000";

			if(hard>50 && carbon<0.7 && tensile>5600){
				System.out.println("10");
			}else if(hard>50 && carbon<0.7){
				System.out.println("9");
			}else if(carbon<0.7 && tensile>5600){
				System.out.println("8");
			}else if(hard>50 && tensile>5600){
				System.out.println("7");
			}else if(hard>50 || carbon<0.7 || tensile>5600){
				System.out.println("6");
			}else{
				System.out.println("5");
			}

			T--;
		}
	}
}