#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sumN;
	int countS,countP,sumS,sumP,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);
	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);
		sumN += N;

		if(T==1){
			assert(sumN<=100000);
		}

		char S[N];
		char P[N];

		scanf("%s",S);
		scanf("%s",P);

		countS = 0;
		countP = 0;
		sumS = 0;
		sumP = 0;
		flag = 1;

		for(int i=0;i<N;i++){
			assert(S[i]=='0' || S[i]=='1');
			assert(P[i]=='0' || P[i]=='1');

			if(S[i]=='1'){
				countS++;
			}

			if(P[i]=='1'){
				countP++;
			}
		}

		if(countS==countP){
			for(int i=0;i<N;i++){
				if(S[i]=='1'){
					sumS++;
				}

				if(P[i]=='1'){
					sumP++;
				}

				if(sumP>sumS){
					flag = 0;
					break;
				}
			}

			if(flag==1){
				printf("Yes\n");
			}else{
				printf("No\n");
			}
		}else{
			printf("No\n");
		}

		T--;
	}
	
	return 0;
}