//run as java -ea binaryNim
import java.util.Scanner;

public class binaryNim{
	public static void main(String[] args){
		int T,N,dee,dum;
		String S,B;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=500) : "T must be 1 <= T <= 500";

		while(T>0){
			N = scan.nextInt();
			S = scan.next();

			assert(N>=1 && N<=50) : "N must be 1 <= N <= 50";
			assert(S.charAt(0)=='D') : "S must be 'Dee' or 'Dum'";
			assert(S.charAt(1)=='e' || S.charAt(1)=='u') : "S must be 'Dee' or 'Dum'";
			assert(S.charAt(2)=='e' || S.charAt(2)=='m') : "S must be 'Dee' or 'Dum'";

			dee = 0;
			dum = 0;

			while(N>0){
				B = scan.next();

				for(int i=0;i<B.length();i++){
					assert(B.charAt(i)=='0' || B.charAt(i)=='1') : "B must be 0 or 1";
				}

				if(B.charAt(0)=='0'){
					for(int i=0;i<B.length();i++){
						if(B.charAt(i)=='0'){
							dee++;
						}
					}
				}else{
					for(int i=0;i<B.length();i++){
						if(B.charAt(i)=='1'){
							dum++;
						}
					}
				}

				N--;
			}

			if(dee>dum){
				System.out.println("Dee");
			}else if(dum>dee){
				System.out.println("Dum");
			}else{
				if(S.equals("Dee")==true){
					System.out.println("Dum");
				}else{
					System.out.println("Dee");
				}
			}

			T--;
		}
	}
}