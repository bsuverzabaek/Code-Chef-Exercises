import java.util.Scanner;

public class chefstring{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		System.out.print("Input T: ");
		T = scan.nextInt();

		while(T>0){
			String S;
			S = inputString();

			int i = 1;
			int count = 0;

			while(i!=S.length()){
				if((S.charAt(i-1)=='x' && S.charAt(i)=='y') || (S.charAt(i-1)=='y' && S.charAt(i)=='x')){
					count++;
					S = S.substring(0,i) + 'o' + S.substring(i + 1);
				}
				i++;
			}
			
			System.out.println(count);

			T--;
		}
	}

	public static String inputString(){
		Scanner sc = new Scanner(System.in);
		String str;

		str = sc.next();
		return str;
	}
}