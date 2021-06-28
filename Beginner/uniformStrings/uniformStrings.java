//run as java -ea uniformStrings
import java.util.Scanner;

public class uniformStrings{
	public static void main(String[] args){
		int T,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=256) : "T must be 1 <= T <= 256";

		while(T>0){
			String s;
			
			s = scan.next();
			assert(s.length()==8) : "Length of s must be 8";

			count = 0;

			for(int i=0;i<7;i++){
				if(s.charAt(i)!=s.charAt(i+1)){
					count++;
				}
			}

			if(count<=2){
				System.out.println("uniform");
			}else{
				System.out.println("non-uniform");
			}
			
			T--;
		}
	}
}