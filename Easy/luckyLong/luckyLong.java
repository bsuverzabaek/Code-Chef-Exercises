//run as java -ea luckyLong
import java.util.Scanner;

public class luckyLong{
	public static void main(String[] args){
		int T,flag;
		String N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.next();
			flag = 0;

			for(int i=0;i<N.length();i++){
				if(N.charAt(i)!='4' && N.charAt(i)!='7'){
					flag++;
				}
			}

			System.out.println(flag);

			T--;
		}
	}
}