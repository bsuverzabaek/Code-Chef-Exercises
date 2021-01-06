import java.util.Scanner;

public class exten{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		System.out.print("Input T: ");
		T = scan.nextInt();

		while(T>0){
			int n;
			System.out.print("Input n: ");
			n = scan.nextInt();

			int[] A = new int[n];
			int[] B = new int[n];
			int[] C = new int[n];

			for(int i=0;i<n;i++){
				C[i] = scan.nextInt();
			}

			for(int i=0;i<n;i++){
				A[i] = C[i] & 0xffff;
				//counter x = x | n
			}

			for(int i=0;i<n;i++){
				B[i] = C[i] >> 16;
				//counter n = n<<(1<<(1<<(1<<1)))
			}

			System.out.println(" ");
			System.out.println("Case " + T + ":");
			print_func(A,n);
			print_func(B,n);

			T--;
		}
	}

	public static void print_func(int[] arr, int n){
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}