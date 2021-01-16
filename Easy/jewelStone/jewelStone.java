import java.util.Scanner;

public class jewelStone{
	public static void main(String[] args) {
		int T,count,note;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100){
				System.out.println("T must be 1 <= T <= 100");
			}else{
				break;
			}
		}

		String cut;

		while(T>0){
			String J = scan.next();
			String S = scan.next();

			if(J.length()>100){
				cut = J.substring(0,100);
				J = cut;
			}

			if(S.length()>100){
				cut = S.substring(0,100);
				S = cut;
			}

			count = 0;

			for(int i=0;i<S.length();i++){
				note = 0;
				for(int j=0;j<J.length();j++){
					if(S.charAt(i)==J.charAt(j) && note==0){
						count++;
						note++;
						break;
					}
				}
			}

			System.out.println(count);

			T--;
		}
	}
}