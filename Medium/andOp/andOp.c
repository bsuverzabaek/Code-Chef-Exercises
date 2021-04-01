#include <stdio.h>
#include <assert.h>

int main(void){
	int N;
	long long int max,temp;

	scanf("%d",&N);
	assert(N>=2 && N<=300000);

	long long int A[300001];

	for(int i=0;i<N;i++){
		scanf("%lld",&A[i]);
		assert(A[i]>=0 && A[i]<=1000000000);
	}

	max = (A[0]&A[1]);

	for(int i=0;i<N;i++){
		if(max>A[i]){
			continue;
		}

		for(int j=i+1;j<=N;j++){
			temp = (A[i]&A[j]);

			if(temp>max){
				max = temp;
			}
		}
	}

	printf("%lld\n",max);
	
	return 0;
}