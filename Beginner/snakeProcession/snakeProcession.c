#include <stdio.h>
#include <assert.h>

int main(void){
	int R,L,a,f;

	scanf("%d",&R);
	assert(R>=1 && R<=500);

	while(R>0){
		scanf("%d",&L);
		assert(L>=1 && L<=500);

		char S[50000];
		scanf("%s",S);

		a = 0;
		f = 0;

		for(int i=0;i<L;i++){
			if(S[i]=='H'){
				a++;
			}

			if(S[i]=='T'){
				a--;
			}

			if(a<0 || a>1){
				f = 1;
				break;
			}
		}

		if(f==1 || a!=0){
			printf("Invalid\n");
		}else if(a==0){
			printf("Valid\n");
		}

		R--;
	}
	
	return 0;
}