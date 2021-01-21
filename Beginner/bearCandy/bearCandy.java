//run as java -ea bearCandy
import java.util.Scanner;

public class bearCandy{
	public static void main(String[] args) {
		int T,A,B;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			A = scan.nextInt();
			B = scan.nextInt();
			assert(A>=1 && A<=1000 && B>=1 && B<=1000) : "A and B must be 1 <= A,B <= 1000";

			for(int i=1;i<5000;i++){
				if(i%2==0){
					B -= i;
					if(B<0){
						System.out.println("Limak");
						break;
					}
				}else{
					A -= i;
					if(A<0){
						System.out.println("Bob");
						break;
					}
				}
			}

			T--;
		}
	}
}