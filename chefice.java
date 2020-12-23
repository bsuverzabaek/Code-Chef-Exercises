import java.util.Scanner;

public class chefice{
	public static void main(String[] args){
		int T;
		Scanner scan = new Scanner(System.in);

		System.out.print("Input T: ");
		T = scan.nextInt();

		while(T>0){
			int N;
			System.out.print("Input N: ");
			N = scan.nextInt();

			int[] arr = new int[N];

			for(int i=0;i<N;i++){
				arr[i] = scan.nextInt();
			}

			int amount = 0;

			if(arr[0]==10 || arr[0]==15){
				System.out.println("No");
			}else{
				amount += arr[0];
				for(int i=1;i<N;i++){
					arr[i] -= 5;
					amount -= arr[i];
				}
				if(amount<0){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
			}

			T--;
		}
	}
}