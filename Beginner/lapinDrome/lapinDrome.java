import java.util.Scanner;
import java.util.Arrays;

public class lapinDrome{
	public static void main(String[] args){
		int T,L;
		String S,left,right;
		boolean ans;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100){
				System.out.println("T must be 1 <= T <= 100");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				S = scan.next();

				if(S.length()<2 || S.length()>1000){
					System.out.println("String S must have length 2 <= S <= 1000");
				}else{
					break;
				}
			}

			L = S.length();

			if(L%2==0){
				left = S.substring(0,L/2);
				right = S.substring(L/2,L);
			}else{
				left = S.substring(0,L/2);
				right = S.substring((L/2)+1,L);
			}

			char temp[] = left.toCharArray();
			char temp2[] = right.toCharArray();
			Arrays.sort(temp);
			Arrays.sort(temp2);

			left = new String(temp);
			right = new String(temp2);

			if(left.compareTo(right)==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}