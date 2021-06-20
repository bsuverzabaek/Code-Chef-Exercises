//run as java -ea snakeProcession
import java.util.Scanner;

public class snakeProcession{
	public static void main(String[] args){
		int R,L,a,f;
		Scanner scan = new Scanner(System.in);

		R = scan.nextInt();
		assert(R>=1 && R<=500) : "R must be 1 <= R <= 500";

		while(R>0){
			L = scan.nextInt();
			assert(L>=1 && L<=500) : "L must be 1 <= L <= 500";

			String S;
			S = scan.next();

			a = 0;
			f = 0;

			for(int i=0;i<L;i++){
				if(S.charAt(i)=='H'){
					a++;
				}

				if(S.charAt(i)=='T'){
					a--;
				}

				if(a<0 || a>1){
					f = 1;
					break;
				}
			}

			if(f==1 || a!=0){
				System.out.println("Invalid");
			}else if(a==0){
				System.out.println("Valid");
			}

			R--;
		}
	}
}