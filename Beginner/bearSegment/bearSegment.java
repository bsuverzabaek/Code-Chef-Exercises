//run as java -ea bearSegment
import java.util.Scanner;

public class bearSegment{
	public static void main(String[] args){
		int T,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			String S;
			
			S = scan.next();
			assert(S.length()>=1 && S.length()<=100000) : "Length of S must be 1 <= |S| <= 10^5";

			flag = 0;

			for(int i=0;i<S.length();i++){
				assert(S.charAt(i)=='0' || S.charAt(i)=='1') : "Each char must be 0 or 1";

				if(S.charAt(i)=='1' && flag==0){
					flag = 1;
				}else if(S.charAt(i)=='1' && flag==2){
					flag = 0;
					break;
				}else if(S.charAt(i)=='0' && flag==1){
					flag = 2;
				}
			}

			if(flag==0){
				System.out.println("NO");
			}else if(flag==1 || flag==2){
				System.out.println("YES");
			}

			T--;
		}
	}
}