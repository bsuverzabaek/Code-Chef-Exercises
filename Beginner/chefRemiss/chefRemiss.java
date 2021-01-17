import java.util.Scanner;

public class chefRemiss{
	public static void main(String[] args){
		int T,A,B;
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
				A = scan.nextInt();
				B = scan.nextInt();

				if(A<0 || A>1000000 || B<0 || B>1000000){
					System.out.println("A and B must be 0 <= A,B <= 1000000");
				}else{
					break;
				}
			}

			System.out.println(max(A,B) + " " + (A+B));

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