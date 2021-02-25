#include <stdio.h>
#include <assert.h>

long long int pre[2000001];
long long int num[1000001];

long long int diamond(long long int sum){
	long long int rem,evenSum,oddSum,ans;

	evenSum = 0;
	oddSum = 0;

	while(sum!=0){
		rem = sum%10;
		sum /= 10;

		if(rem%2==0){
			evenSum += rem;
		}else{
			oddSum += rem;
		}
	}

	if(evenSum-oddSum>=0){
		ans = evenSum-oddSum;
	}else{
		ans = oddSum-evenSum;
	}

	return ans;
}

int main(void){
	int T;
	long long int prev,start,end,N;

	for(int i=0;i<=2000001;i++){
		pre[i] = diamond(i);
	}

	num[1] = 2;
	prev = num[1];
	start = 2;
	end = 2;

	for(int i=2;i<=1000001;i++){
		prev = prev-pre[start]+pre[end+1];
		num[i] = num[i-1]+2*prev+pre[end+2];
		prev = prev+pre[end+2];
		start++;
		end += 2;
	}

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld",&N);
		assert(N>=1 && N<=1000000);
		printf("%lld\n",num[N]);

		T--;
	}
	
	return 0;
}