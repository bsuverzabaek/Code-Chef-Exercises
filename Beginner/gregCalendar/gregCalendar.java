//run as java -ea gregCalendar
import java.util.Scanner;

public class gregCalendar{
	public static void main(String[] args){
		int T,year,startYear,diff,leapYear,totalDays,day;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			year = scan.nextInt();
			assert(year>=1900 && year<=5000) : "year must be 1900 <= year <= 5000";

			startYear = 1900;
			diff = year-startYear;
			leapYear = 0;

			while(startYear<year){
				if(startYear%100==0){
					if(startYear%400==0){
						leapYear++;
					}
				}else{
					if(startYear%4==0){
						leapYear++;
					}
				}

				startYear++;
			}

			totalDays = (diff-leapYear)*365+leapYear*366;
			day = totalDays%7;

			if(day==0){
				System.out.println("monday");
			}else if(day==1){
				System.out.println("tuesday");
			}else if(day==2){
				System.out.println("wednesday");
			}else if(day==3){
				System.out.println("thursday");
			}else if(day==4){
				System.out.println("friday");
			}else if(day==5){
				System.out.println("saturday");
			}else if(day==6){
				System.out.println("sunday");
			}

			T--;
		}
	}
}