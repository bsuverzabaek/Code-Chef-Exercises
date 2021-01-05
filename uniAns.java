import java.util.Scanner;

public class uniAns{
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);

		while(true){
			n = scan.nextInt();
			if(n<=-100 || n>=100){
				System.out.println("Input must be integers of one or two digits");
			}else if(n!=42){
				System.out.println(n);
			}else if(n==42){
				break;
			}
		}
	}
}