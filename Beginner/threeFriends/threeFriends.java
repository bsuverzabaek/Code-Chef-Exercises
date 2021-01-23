//run as java -ea threeFriends
import java.util.Scanner;

public class threeFriends{
	public static void main(String[] args){
		int T,X,Y,Z;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=30) : "T must be 1 <= T <= 30";

		while(T>0){
			X = scan.nextInt();
			Y = scan.nextInt();
			Z = scan.nextInt();

			assert(X>=1 && X<=3) : "X must be 1 <= X <= 3";
			assert(Y>=1 && Y<=3) : "Y must be 1 <= Y <= 3";
			assert(Z>=1 && Z<=3) : "Z must be 1 <= Z <= 3";

			if(X+Y+Z==2*max(X,Y,Z)){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

			T--;
		}
	}

	public static int max(int a,int b,int c){
		if(a>b && a>c){
			return a;
		}else if(b>a && b>c){
			return b;
		}else{
			return c;
		}
	}
}