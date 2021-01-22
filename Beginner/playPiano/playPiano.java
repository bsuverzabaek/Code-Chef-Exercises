//run as java -ea playPiano
import java.util.Scanner;

public class playPiano{
	public static void main(String[] args) {
		int T,countA,countB,flag;
		String s;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=500) : "T must be 1 <= T <= 500";

		while(T>0){
			s = scan.next();
			assert(s.length()>=2 && s.length()%2==0) : "String must be at least 2 in length and be even";

			for(int i=0;i<s.length();i++){
				assert(s.charAt(i)=='A' || s.charAt(i)=='B') : "String must only have A and B characters";
			}

			countA = 0;
			countB = 0;
			flag = 0;

			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='A'){
					countA++;
				}else{
					countB++;
				}

				if(i%2!=0 && countA!=countB){
					flag = 1;
					break;
				}
			}

			if(flag==0){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

			T--;
		}
	}
}