//run as java -ea nameMine
import java.util.Scanner;

public class nameMine{
	public static void main(String[] args) throws java.lang.Exception{
		int T,j,k;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			String M = scan.next();
			String W = scan.next();

			assert(M.length()>=1 && M.length()<=25000) : "M must be 1 <= |M| <= 25000";
			assert(W.length()>=1 && W.length()<=25000) : "W must be 1 <= |W| <= 25000";

			for(int i=0;i<M.length();i++){
				assert(M.charAt(i)>=97 && M.charAt(i)<=122) : "M must only have lower case letters";
			}

			for(int i=0;i<W.length();i++){
				assert(W.charAt(i)>=97 && W.charAt(i)<=122) : "W must only have lower case letters";
			}

			j = 0;
			k = 0;

			for(int i=0;i<W.length() && j<M.length();i++){
				if(M.charAt(j)==W.charAt(i)){
					j++;
				}
			}

			for(int i=0;i<M.length() && k<W.length();i++){
				if(W.charAt(k)==M.charAt(i)){
					k++;
				}
			}

			if(j==M.length()){
				System.out.println("YES");
			}else if(k==W.length()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}