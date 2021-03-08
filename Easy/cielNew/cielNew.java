//run as java -ea cielNew
import java.util.Scanner;

public class cielNew{
	public static void main(String[] args){
		String S;
		int x,nonzero;
		long count;
		Scanner scan = new Scanner(System.in);

		S = scan.next();
		assert(S.length()>=1 && S.length()<=1000000) : "String must have length 1 <= |S| <= 10^6";

		count = 0;

		for(int i=0;i<S.length();i++){
			assert(S.charAt(i)>=48 && S.charAt(i)<=57) : "All characters must be digits";
			x = S.charAt(i)-'0';

			if(x%8==0){
				count++;
			}
		}

		for(int i=1;i<S.length();i++){
			if(S.charAt(i-1)=='0'){
				continue;
			}

			x = (S.charAt(i-1)-'0')*10+(S.charAt(i)-'0');

			if(x%8==0){
				count++;
			}
		}

		nonzero = 0;

		for(int i=2;i<S.length();i++){
			x = (S.charAt(i-2)-'0')*100+(S.charAt(i-1)-'0')*10+(S.charAt(i)-'0');

			if(S.charAt(i-2)!='0'){
				nonzero++;
			}

			if(x%8==0){
				count += nonzero;
			}
		}

		System.out.println(count);
	}
}