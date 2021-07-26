//run as java -ea bigSale
import java.util.Scanner;

public class bigSale{
	public static void main(String[] args){
		int T,N,p,q,d;
		double price,dPrice,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			sum = 0.0;

			while(N>0){
				 p = scan.nextInt();
				 q = scan.nextInt();
				 d = scan.nextInt();

				assert(p>=1 && p<=100) : "price must be 1 <= price <= 100";
				assert(q>=1 && q<=100) : "quantity must be 1 <= quantity <= 100";
				assert(d>=0 && d<=100) : "discount must be 1 <= discount <= 100";

				price = p+(double)(p*d)/100;
				dPrice = price-(double)(price*d)/100;
				sum += (double)q*(p-dPrice);

				N--;
			}

			System.out.printf("%.6f",sum);
			System.out.println();

			T--;
		}
	}
}