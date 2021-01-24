//run as java -ea fancyQuote
import java.util.Scanner;

public class fancyQuote{
	public static void main(String[] args){
		int T,flag;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		scan.nextLine();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			S = scan.nextLine();
			assert(S.length()>=1 && S.length()<=100) : "String S must be of length 1 <= S <= 100";

			for(int i=0;i<S.length();i++){
				assert((S.charAt(i)>=97 && S.charAt(i)<=122) || S.charAt(i)==' ') : "String S must be made up of either lower case English letters or a space";
			}

			String[] A = S.split(" ");

			flag = 0;

			for(int i=0;i<A.length;i++){
				if(A[i].equals("not")){
					flag = 1;
				}
			}

			if(flag==1){
				System.out.println("Real Fancy");
			}else{
				System.out.println("regularly fancy");
			}

			T--;
		}
	}
}