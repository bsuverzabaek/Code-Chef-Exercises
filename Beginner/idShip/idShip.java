import java.util.Scanner;

public class idShip{
	public static void main(String[] args) {
		int T;
		char id;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 1000");
			}else{
				break;
			}
		}

		while(T>0){

			id = scan.next(".").charAt(0);

			if(id=='B' || id=='b'){
				System.out.println("BattleShip");
			}else if(id=='C' || id=='c'){
				System.out.println("Cruiser");
			}else if(id=='D' || id=='d'){
				System.out.println("Destroyer");
			}else if(id=='F' || id=='f'){
				System.out.println("Frigate");
			}

			T--;
		}
	}
}