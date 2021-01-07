import java.util.Scanner;

public class byteGold{
	public static void main(String[] args) {
		int T;
		int n;
		int sum;

		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>10){
				System.out.println("T must be 1 <= T <= 10");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				n = scan.nextInt();

				if(n<0 || n>1000000000){
					System.out.println("n must be 0 <= n <= 10^9");
				}else{
					break;
				}
			}

			sum = sumFunc(n);

			if(sum>n){
				System.out.println(sum);
			}else{
				System.out.println(n);
			}

			T--;
		}
	}

	public static int sumFunc(int n){
		int sum = 0;
		sum += n/2 + n/3 + n/4;
		return sum;
	}
}