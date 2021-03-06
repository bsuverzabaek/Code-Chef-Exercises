//run as java -ea eidiGift
import java.util.Scanner;

public class eidiGift{
	public static void main(String[] args){
		int T,flag;

		int[] A = new int[3];
		int[] C = new int[3];

		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			for(int i=0;i<3;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=17) : "A["+i+"] must be 1 <= A[i] <= 17";
			}

			for(int i=0;i<3;i++){
				C[i] = scan.nextInt();
				assert(C[i]>=1 && C[i]<=100) : "C["+i+"] must be 1 <= C[i] <= 100";
			}

			flag = 1;

			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i!=j){
						if(A[i]<A[j]){
							if(C[i]>=C[j]){
								flag = 0;
								break;
							}
						}else if(A[i]==A[j]){
							if(C[i]!=C[j]){
								flag = 0;
								break;
							}
						}else{
							if(C[i]<=C[j]){
								flag = 0;
								break;
							}
						}
					}
				}
			}

			if(flag==1){
				System.out.println("FAIR");
			}else{
				System.out.println("NOT FAIR");
			}

			T--;
		}
	}
}