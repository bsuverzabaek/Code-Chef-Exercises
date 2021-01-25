#include <stdio.h>
#include <assert.h>

int main(void){
	int T,flag;
	char logo[4][4];

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		for(int i=0;i<3;i++){
			scanf("%s",logo[i]);
		}

		flag = 0;

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				if(logo[i][j]=='l'){
					if(logo[i+1][j]=='l'){
						if(logo[i+1][j+1]=='l'){
							flag = 1;
							printf("yes\n");
							break;
						}
					}
				}
			}
			if(flag==1){
				break;
			}
		}

		if(flag==0){
			printf("no\n");
		}

		T--;
	}
	
	return 0;
}