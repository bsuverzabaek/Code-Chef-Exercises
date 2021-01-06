import java.util.Scanner;

public class movieWknd{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<=0 || T>5){
				System.out.println("T must be 1 <= T <= 5");
			}else{
				break;
			}
		}

		while(T>0){
			int n;

			while(true){
				System.out.print("Input n: ");
				n = scan.nextInt();

				if(n<=0 || n>100){
					System.out.println("n must be 1 <= n <= 100");
				}else{
					break;
				}
			}

			int [] L = new int[n];
			int [] R = new int[n];

			for(int i=0;i<n;i++){
				while(true){
					L[i] = scan.nextInt();
					if(L[i]<=0 || L[i]>100){
						System.out.println("L["+i+"] must be 1 <= L[i] <= 100");
					}else{
						break;
					}
				}
			}

			for(int i=0;i<n;i++){
				while(true){
					R[i] = scan.nextInt();
					if(R[i]<=0 || R[i]>100){
						System.out.println("R["+i+"] must be 1 <= R[i] <= 100");
					}else{
						break;
					}
				}
			}

			int max = 0;
			int maxR = 0;
			int num = 0;

			for(int i=0;i<n;i++){
				if(L[i]*R[i]>max){
					max = L[i]*R[i];
					maxR = R[i];
					num = i;
				}else if(L[i]*R[i]==max && R[i]>maxR){
					maxR = R[i];
					num = i;
				}
			}

			System.out.println(num+1);

			T--;
		}
	}
}