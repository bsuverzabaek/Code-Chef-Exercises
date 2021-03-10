#include <stdio.h>
#include <assert.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,stu,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000);

		int arr[N];
		int height[N];
		int iq[N];

		for(int i=0;i<N;i++){
			scanf("%d",&height[i]);
			assert(height[i]>=1 && height[i]<=1000000000);
			arr[i] = 1;
		}

		for(int i=0;i<N;i++){
			scanf("%d",&iq[i]);
			assert(iq[i]>=1 && iq[i]<=1000000000);
		}

		ans = 1;
		stu = 1;

		while(stu<N){
			for(int i=0;i<stu;i++){
				if(height[i]<height[stu] && iq[i]>iq[stu]){
					arr[stu] = max(arr[stu],arr[i]+1);

					if(ans<arr[stu]){
						ans = arr[stu];
					}
				}
			}

			stu++;
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}