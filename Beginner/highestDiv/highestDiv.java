//run as java -ea highestDiv
import java.util.Scanner;

public class highestDiv{
	public static void main(String[] args){
		int N;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=2 && N<=1000) : "N must be 2 <= N <= 1000";

		for(int i=10;i>=1;i--){
			if(N%i==0){
				System.out.println(i);
				break;
			}
		}
	}
}