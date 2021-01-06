import java.util.Scanner;

public class atm{
	public static void main(String[] args) {
		int x;
		double y;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input X: ");
			x = scan.nextInt();

			if(x<=0 || x>2000){
				System.out.println("X must be 0 < X <= 2000");
			}else{
				break;
			}
		}

		while(true){
			System.out.print("Input Y: ");
			y = scan.nextDouble();

			if(y<0 || y>2000){
				System.out.println("Y must be 0 <= X <= 2000");
			}else{
				break;
			}
		}

		if(x%5 != 0 || y-x-0.50<0){
			System.out.println(String.format("%.2f",y));
		}else{
			System.out.println(String.format("%.2f",y-x-0.50));
		}
	}
}