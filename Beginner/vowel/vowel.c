#include <stdio.h>

int main(void){
	char C;

	while(1){
		scanf("\n%c",&C);

		if(C<=64 || C>=91){
			printf("Character C must be an upper case English letter\n");
		}else{
			break;
		}
	}

	if(C=='A' || C=='E' || C=='I' || C=='O' || C=='U'){
		printf("Vowel\n");
	}else{
		printf("Consonant\n");
	}

	return 0;
}