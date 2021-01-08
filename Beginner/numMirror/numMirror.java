import java.util.Scanner;

public class numMirror{
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);

		while(true){
			n = scan.nextInt();

			if(n<0 || n>100000){
				System.out.println("n must be 0 <= n <= 10^5");
			}else{
				System.out.println(n);
				break;
			}
		}
	}
}