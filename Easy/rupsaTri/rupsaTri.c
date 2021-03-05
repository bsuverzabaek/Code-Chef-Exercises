#include <stdio.h>
#include <assert.h>

int check[5000005] = {0};

int main(void){
	int T,N;

	for(int i=1;i<=2237;i++){
		for(int j=i;j<=2237;j++){
			if((i*i)+(j*j)>=5000005){
				break;
			}

			if(i!=j){
				check[(i*i)+(j*j)] = 1;
			}
		}
	}

	check[2] = 0;

	for(int i=2500001;i>1;i--){
		if(check[i]!=0){
			for(int j=2;i*j<5000001;j++){
				check[i*j] = 1;
			}
		}
	}

	scanf("%d",&T);
	assert(T>=1 && T<=1000000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=5000000);

		if(check[N]!=0){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}