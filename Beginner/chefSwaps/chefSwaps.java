//run as java -ea chefSwaps
import java.util.Scanner;

public class chefSwaps{
	public static void main(String[] args){
		int T,A,B,num1,num2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			A = scan.nextInt();
			B = scan.nextInt();

			assert(A>=1 && A<=99) : "A must be 1 <= A <= 99";
			assert(B>=1 && B<=99) : "B must be 1 <= B <= 99";

			if(A/10!=0 && B/10!=0){
				num1 = (B%10)*10 + A%10 + (B-B%10)+(A/10);
				num2 = (A%10)*10 + B%10 + (A-A%10)+(B/10);
			}else if(A/10==0 && B/10!=0){
				num1 = A*10 + B%10 + B/10;
				num2 = 0;
			}else if(A/10!=0 && B/10==0){
				num1 = B*10 + A%10 + A/10;
				num2 = 0;
			}else{
				num1 = 0;
				num2 = 0;
			}

			System.out.println(max(A+B,max(num1,num2)));

			T--;
		}
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}