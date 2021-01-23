#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,chef,bro;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=100);
		assert(K>=0 && K<=N);

		char s[N];
		scanf("%s",s);

		for(int i=0;i<N;i++){
			assert((s[i]>=65 && s[i]<=90) || (s[i]>=97 && s[i]<=122));
		}

		chef = 0;
		bro = 0;

		for(int i=0;i<N;i++){
			if(s[i]>=65 && s[i]<=90){
				chef++;
			}else{
				bro++;
			}
		}

		if(chef<=K && bro>K){
			printf("chef\n");
		}else if(bro<=K && chef>K){
			printf("brother\n");
		}else if(chef<=K && bro<=K){
			printf("both\n");
		}else{
			printf("none\n");
		}

		T--;
	}

	return 0;
}