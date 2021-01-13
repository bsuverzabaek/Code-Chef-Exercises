import java.util.*;
import java.lang.*;

public class transformEx{
	public static int order(char o){
		if(o=='+' || o=='-'){
			return 1;
		}else if(o=='*' || o=='/'){
			return 2;
		}else if(o=='^'){
			return 3;
		}

		return -1;
	}

	public static void main(String[] args){
		int t;
		String s,s2;
		Scanner scan = new Scanner(System.in);

		while(true){
			t = scan.nextInt();

			if(t<=0 || t>100){
				System.out.println("t must be 1 <= t < 100");
			}else{
				break;
			}
		}

		while(t>0){
			s = scan.next();
			s2 = "";
			Stack<Character> str = new Stack<Character>();

			for(int i=0;i<s.length();i++){
				if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
					s2 += s.charAt(i);
				}else if(s.charAt(i)=='('){
					str.push('(');
				}else if(s.charAt(i)==')'){
					while(!str.isEmpty() && str.peek()!='('){
						s2 += str.pop();
					}
					if(!str.isEmpty()){
						str.pop();
					}
				}else{
					while(!str.isEmpty() && order(s.charAt(i))<=order(str.peek())){
						s2 += str.pop();
					}
					str.push(s.charAt(i));
				}
			}

			while(!str.isEmpty()){
				if(str.peek()!='('){
					s2 += str.pop();
				}
			}

			System.out.println(s2);

			t--;
		}
	}
}