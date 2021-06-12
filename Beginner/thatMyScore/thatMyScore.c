#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,p,s,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000);

		int arr[8] = {0};

		while(N>0){
			scanf("%d %d",&p,&s);

			assert(p>=1 && p<=11);
			assert(s>=0 && s<=100);

			if(p<=8){
				if(arr[p-1]==0 || arr[p-1]<s){
					arr[p-1] = s;
				}
			}

			N--;
		}

		sum = 0;

		for(int i=0;i<8;i++){
			sum += arr[i];
		}

		printf("%d\n",sum);

		T--;
	}
	
	return 0;
}