#include <stdio.h>
#include <assert.h>

int main(void){
	int T,year,startYear,diff,leapYear,totalDays,day;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d",&year);
		assert(year>=1900 && year<=5000);

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
			printf("monday\n");
		}else if(day==1){
			printf("tuesday\n");
		}else if(day==2){
			printf("wednesday\n");
		}else if(day==3){
			printf("thursday\n");
		}else if(day==4){
			printf("friday\n");
		}else if(day==5){
			printf("saturday\n");
		}else if(day==6){
			printf("sunday\n");
		}

		T--;
	}
	
	return 0;
}