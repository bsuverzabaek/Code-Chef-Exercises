//run as java -ea feedBack
import java.util.Scanner;

public class feedBack{
	public static void main(String[] args){
		int T;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			S = scan.next();
			assert(S.length()>=1 && S.length()<=100000) : "S must be length 1 <= |S| <= 10^5";

			for(int i=0;i<S.length();i++){
				assert(S.charAt(i)=='0' || S.charAt(i)=='1') : "S must only have 0 or 1";
			}

			if(S.contains("010") || S.contains("101")){
				System.out.println("Good");
			}else{
				System.out.println("Bad");
			}

			T--;
		}
	}
}