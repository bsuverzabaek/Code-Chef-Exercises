//run as java -ea countStrings
import java.util.Scanner;

public class countStrings{
	public static void main(String[] args){
		long ans,prefix,x,MOD;
		String S;
		Scanner scan = new Scanner(System.in);

		MOD = 1000000007;

		S = scan.next();
		assert(S.length()>=1 && S.length()<=100000) : "String of S must have length 1 <= |S| <= 10^5";

		ans = 0;
		ans += (long)('Z'-S.charAt(0));

		prefix = 0;
		prefix = (long)('Z'-S.charAt(0));

		for(int i=1;i<S.length();i++){
			x = (long)('Z'-S.charAt(i));
			ans = (ans+((prefix+1)*x))%MOD;
			prefix = ((26*prefix)+x)%MOD;
		}

		System.out.println(ans);
	}
}