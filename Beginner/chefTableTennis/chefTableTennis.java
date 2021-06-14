//run as java -ea chefTableTennis
import java.util.Scanner;

public class chefTableTennis{
	public static void main(String[] args){
		int T,count0,count1;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			String S;
			
			S = scan.next();
			assert(S.length()>=1 && S.length()<=100) : "Length of S must be 1 <= |S| <= 100";

			count0 = 0;
			count1 = 0;

			for(int i=0;i<S.length();i++){
				if(S.charAt(i)=='1'){
					count1++;
				}else{
					count0++;
				}
			}

			if(count0>count1){
				System.out.println("LOSE");
			}else{
				System.out.println("WIN");
			}

			T--;
		}
	}
}