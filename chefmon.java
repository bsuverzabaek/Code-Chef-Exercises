import java.util.Scanner;

public class chefmon{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		System.out.print("Input T: ");
		T = scan.nextInt();

		int total;

		while(T>0){
			total = 0;
			int[] A = new int[2];

			for(int i=0;i<2;i++){
				A[i] = scan.nextInt();
			}

			if(A[0]%A[1]==0){
				total += A[0]/A[1];
			}else if(A[0]%2!=0){
				A[0] -= 1;
				total++;
				if(A[0]!=0){
					for(int i=A[1];i>=2;i-=2){
						int j = 1;
						while(i*j<=A[0]){
							j++;
						}
						j--;
						total += j;
						A[0] -= i*j;
					}
				}
			}else{
				for(int i=A[1];i>=2;i-=2){
					int j = 1;
					while(i*j<=A[0]){
						j++;
					}
					j--;
					total += j;
					A[0] -= i*j;
				}
			}

			System.out.println(total);

			T--;
		}
	}
}