#include <stdio.h>
#include <assert.h>

int main(void){
	int T,count;

	scanf("%d",&T);
	assert(T>=1 && T<=256);

	while(T>0){
		char s[9];
		scanf("%s",s);

		count = 0;

		for(int i=0;i<7;i++){
			if(s[i]!=s[i+1]){
				count++;
			}
		}

		if(count<=2){
			printf("uniform\n");
		}else{
			printf("non-uniform\n");
		}

		T--;
	}
	
	return 0;
}