#include <stdio.h>
#include <assert.h>

int lowerBound(int a[],int high,int t){
	int l = 0;
	int mid;

	while(high>=l){
		mid = (l+high)/2;

		if(a[mid]>=t){
			high = mid-1;
		}else{
			l = mid+1;
		}
	}

	return l;
}

int main(void){
	int n,m,t,d,q1,q2;
	int a[100001];

	scanf("%d",&n);
	assert(n>=1 && n<=100000);

	for(int i=0;i<n;i++){
		scanf("%d",&a[i]);
		assert(a[i]>=1 && a[i]<=1000000);
	}

	scanf("%d",&m);
	assert(m>=1 && m<=100000);

	while(m>0){
		scanf("%d %d",&t,&d);

		assert(t>=a[0] && t<=1000000);
		assert(d>=0 && d<=1000000);

		q1 = lowerBound(a,n-1,t);

		if(q1>=n || a[q1]>t){
			q1--;
		}

		while(q1>0 && a[q1-1]+d>=a[q1]){
			q2 = lowerBound(a,q1-1,a[q1]-d);
			q1 = q2;
		}

		printf("%d\n",q1+1);

		m--;
	}
	
	return 0;
}