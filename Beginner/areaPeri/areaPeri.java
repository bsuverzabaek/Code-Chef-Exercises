import java.util.Scanner;

public class areaPeri{
	public static void main(String[] args) {
		int L,B;
		Scanner scan = new Scanner(System.in);

		while(true){
			L = scan.nextInt();
			B = scan.nextInt();

			if(L<=0 || L>1000 || B<=0 || B>1000){
				System.out.println("L and B must be 1 <= L,B <= 1000");
			}else{
				break;
			}
		}

		if((L*B)>(2*(L+B))){
			System.out.println("Area");
			System.out.println(L*B);
		}else if((2*(L+B))>(L*B)){
			System.out.println("Peri");
			System.out.println(2*(L+B));
		}else{
			System.out.println("Eq");
			System.out.println(L*B);
		}
	}
}