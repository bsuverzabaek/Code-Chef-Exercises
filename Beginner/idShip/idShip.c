#include <stdio.h>

int main(void){
	int T;
	char id;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){

		scanf("\n%c",&id);

		if(id=='B' || id=='b'){
			printf("BattleShip\n");
		}else if(id=='C' || id=='c'){
			printf("Cruiser\n");
		}else if(id=='D' || id=='d'){
			printf("Destroyer\n");
		}else if(id=='F' || id=='f'){
			printf("Frigate\n");
		}

		T--;
	}

	return 0;
}