#include <stdio.h>
#include <string.h>

int main(void){
	int T,count,note;
	char J[100];
	char S[100];

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100){
			printf("T must be 1 <= T <= 100\n");
		}else{
			break;
		}
	}

	while(T>0){
		scanf("%s",J);
		scanf("%s",S);

		count = 0;

		for(int i=0;i<strlen(S);i++){
			note = 0;
			for(int j=0;j<strlen(J);j++){
				if(S[i]==J[j] && note==0){
					count++;
					note++;
					break;
				}

			}
		}

		printf("%d\n",count);

		T--;
	}

	return 0;
}