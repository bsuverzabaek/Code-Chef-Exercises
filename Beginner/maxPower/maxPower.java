//run as java -ea maxPower
import java.util.Scanner;

public class maxPower{
	public static void main(String[] args){
		int N,count;
		String X;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

		X = scan.next();
		count = 0;

		for(int i=N-1;i>=0;i--){
			if(X.charAt(i)=='0'){
				count++;
			}else{
				break;
			}
		}

		System.out.println(count);
	}
}