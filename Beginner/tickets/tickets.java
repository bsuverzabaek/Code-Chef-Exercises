//run as java -ea tickets
import java.util.Scanner;

public class tickets{
	public static void main(String[] args){
		int T,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			String S;
			S = scan.next();

			for(int i=0;i<S.length();i++){
				assert(S.charAt(i)>=65 && S.charAt(i)<=90) : "All letters must be upper-case latin letters";
			}

			if(S.charAt(0)==S.charAt(1)){
				System.out.println("NO");
			}else{
				flag = 0;

				for(int i=0;i<S.length();i++){
					if(i%2==0){
						if(S.charAt(0)!=S.charAt(i)){
							flag = 1;
							break;
						}
					}else{
						if(S.charAt(1)!=S.charAt(i)){
							flag = 1;
							break;
						}
					}
				}

				if(flag==0){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}

			T--;
		}
	}
}