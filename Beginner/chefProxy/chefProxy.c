#include <stdio.h>
#include <assert.h>

int main(void){
	int T,D,count,proxy,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=200);

	while(T>0){
		scanf("%d",&D);
		assert(D>=1 && D<=1000);

		char S[D];
		scanf("%s",S);

		for(int i=0;i<D;i++){
			assert(S[i]=='A' || S[i]=='P');
		}

		count = 0;
		proxy = 0;
		flag = 0;

		for(int i=0;i<D;i++){
			if(S[i]=='P'){
				count++;
			}
		}

		if(count>=(75*D+99)/100){
			printf("%d\n",proxy);
		}else{
			for(int i=2;i<D-2;i++){
				if((S[i-2]=='P'||S[i-1]=='P')&&(S[i+1]=='P'||S[i+2]=='P')&&S[i]=='A'){
					count++;
					proxy++;

					if(count>=(75*D+99)/100){
						flag = 1;
						printf("%d\n",proxy);
						break;
					}
				}
			}

			if(flag==0){
				printf("-1\n");
			}
		}

		T--;
	}

	return 0;
}