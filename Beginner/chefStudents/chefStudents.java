//run as java -ea chefStudents
import java.util.Scanner;

public class chefStudents{
	public static void main(String[] args){
		int T,c;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			String s = scan.next();
			assert(s.length()>=1 && s.length()<=100000) : "Length of s must be 1 <= |s| <= 10^5";

			c = 0;

			for(int i=0;i<s.length()-1;i++){
				if(s.charAt(i)=='<' && s.charAt(i+1)=='>'){
					c++;
				}
			}

			System.out.println(c);

			T--;
		}
	}
}