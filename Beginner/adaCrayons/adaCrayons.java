//run as java -ea adaCrayons
import java.util.Scanner;

public class adaCrayons{
	public static void main(String[] args){
		int T,countU,countD;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=3000) : "T must be 1 <= T <= 3000";

		while(T>0){
			String S;

			S = scan.next();
			assert(S.length()>=1 && S.length()<=50) : "Length of S must be 1 <= |S| <= 50";

			countU = 0;
			countD = 0;

			for(int i=0;i<S.length()-1;i++){
				if(S.charAt(i)=='D' && S.charAt(i+1)=='U'){
					countD++;
				}else if(S.charAt(i)=='U' && S.charAt(i+1)=='D'){
					countU++;
				}
			}

			if(S.charAt(S.length()-1)=='D'){
				countD++;
			}else{
				countU++;
			}

			if(countU<countD){
				System.out.println(countU);
			}else{
				System.out.println(countD);
			}

			T--;
		}
	}
}