import java.util.Scanner;

public class flipCoin{
	public static void main(String[] args) {
		int N,Q;
		Scanner scan = new Scanner(System.in);

		while(true){
			N = scan.nextInt();
			Q = scan.nextInt();

			if(N<=0 || N>100000){
				System.out.println("N must be 1 <= N <= 100000");
			}else if(Q<=0 || Q>100000){
				System.out.println("Q must be 1 <= Q <= 100000");
			}else{
				break;
			}
		}

		int[] coins = new int[N];

		for(int i=0;i<N;i++){
			coins[i] = 0;
		}

		int num,A,B;

		while(Q>0){

			while(true){
				num = scan.nextInt();
				A = scan.nextInt();
				B = scan.nextInt();

				if(num<0 || num>1){
					System.out.println("The first number must be 0 or 1");
				}else if(A<0 || A>B){
					System.out.println("A must be 0 <= A <= B");
				}else if(B<A || B>N-1){
					System.out.println("B must be A <= B <= N-1");
				}else{
					break;
				}
			}

			if(num==0){
				flipFunc(coins,A,B);
			}else{
				System.out.println(countFunc(coins,A,B));
			}

			Q--;
		}
	}

	public static void flipFunc(int[] coins,int A,int B){
		for(int i=A;i<=B;i++){
			if(coins[i]==0){
				coins[i] = 1;
			}else{
				coins[i] = 0;
			}
		}
	}

	public static int countFunc(int[] coins,int A,int B){
		int count = 0;

		for(int i=A;i<=B;i++){
			if(coins[i]==1){
				count++;
			}
		}

		return count;
	}
}