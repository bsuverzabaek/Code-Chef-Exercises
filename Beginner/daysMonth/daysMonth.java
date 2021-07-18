//run as java -ea daysMonth
import java.util.Scanner;

public class daysMonth{
	public static void main(String[] args){
		int T,W,i;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 10^3";

		while(T>0){
			String S;
			
			W = scan.nextInt();
			S = scan.next();

			assert(W>=28 && W<=31) : "W must be 28 <= W <= 31";

			int a[] = {4,4,4,4,4,4,4};
			i = 0;

			if(S.equals("mon")==true){
				i = 0;
			}else if(S.equals("tues")==true){
				i = 1;
			}else if(S.equals("wed")==true){
				i = 2;
			}else if(S.equals("thurs")==true){
				i = 3;
			}else if(S.equals("fri")==true){
				i = 4;
			}else if(S.equals("sat")==true){
				i = 5;
			}else if(S.equals("sun")==true){
				i = 6;
			}

			for(int j=29;j<=W;j++){
				a[i] += 1;
				i++;

				if(i==7){
					i = 0;
				}
			}

			for(int j=0;j<7;j++){
				System.out.print(a[j] + " ");
			}
			System.out.println();

			T--;
		}
	}
}