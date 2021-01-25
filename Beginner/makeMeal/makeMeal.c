#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,N,min,l;
	char S[1000];

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		int count[6] = {0};
		l = 0;

		for(int i=0;i<N;i++){
			scanf("%s",S);
			l += strlen(S);

			if(i==N-1){
				assert(l<=1000);
			}

			for(int j=0;S[j]!='\0';j++){
				assert(S[j]>=97 && S[j]<=122);

				if(S[j]=='c'){
					count[0]++;
				}else if(S[j]=='o'){
					count[1]++;
				}else if(S[j]=='d'){
					count[2]++;
				}else if(S[j]=='e'){
					count[3]++;
				}else if(S[j]=='h'){
					count[4]++;
				}else if(S[j]=='f'){
					count[5]++;
				}
			}
		}

		count[0] /= 2;
		count[3] /= 2;
		min = count[5];

		for(int i=0;i<6;i++){
			if(count[i]<min){
				min = count[i];
			}
		}

		printf("%d\n",min);

		T--;
	}

	return 0;
}