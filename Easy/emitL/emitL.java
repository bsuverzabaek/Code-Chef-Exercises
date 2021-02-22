//run as java -ea emitL
import java.util.Scanner;

public class emitL{
	public static void main(String[] args){
		int T,eCount,iCount,lCount,mCount,tCount;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			S = scan.next();
			assert(S.length()>=1 && S.length()<=100) : "Length of S must be 1 <= S <= 100";

			eCount = 0;
			iCount = 0;
			lCount = 0;
			mCount = 0;
			tCount = 0;

			for(int i=0;i<S.length();i++){
				if(S.charAt(i)=='E'){
					eCount++;
				}

				if(S.charAt(i)=='I'){
					iCount++;
				}

				if(S.charAt(i)=='L'){
					lCount++;
				}

				if(S.charAt(i)=='M'){
					mCount++;
				}

				if(S.charAt(i)=='T'){
					tCount++;
				}
			}

			if(S.length()<9){
				System.out.println("NO");
			}else if(S.length()==9){
				if(eCount>=1 && iCount>=2 && lCount>=2 && mCount>=2 && tCount>=2){
					System.out.println("YES");
				}
			}else{
				if(eCount>=2 && iCount>=2 && lCount>=2 && mCount>=2 && tCount>=2){
					System.out.println("YES");
				}
			}

			T--;
		}
	}
}