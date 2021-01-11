import java.util.Scanner;

public class treeRoot{
	public static void main(String[] args) {
		int T,N,id,sum,root;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>50){
				System.out.println("T must be 1 <= T <= 50");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>30){
					System.out.println("N must be 1 <= N <= 30");
				}else{
					break;
				}
			}

			root = 0;

			while(N>0){

				while(true){
					id = scan.nextInt();
					sum = scan.nextInt();

					if(id<=0 || id>1000){
						System.out.println("id must be 1 <= id <= 1000");
					}else{
						break;
					}
				}

				root += id-sum;

				N--;
			}

			System.out.println(root);

			T--;
		}
	}
}