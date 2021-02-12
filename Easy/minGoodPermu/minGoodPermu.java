//run as java -ea minGoodPermu
import java.util.Scanner;

public class minGoodPermu{
	public static void main(String[] args){
		int T,n;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			n = scan.nextInt();
			assert(n>=2 && n<=100000) : "n must be 2 <= n <= 10^5";

			if(n%2==0){
				print_func(n);
			}else{
				n -= 3;
				print_func(n);
				System.out.print((n+2) + " " + (n+3) + " " + (n+1));
			}

			System.out.println();

			T--;
		}
	}

	public static void print_func(int n){
		for(int i=1;i<=n;i+=2){
			System.out.print(i+1 + " " + i + " ");
		}
	}
}