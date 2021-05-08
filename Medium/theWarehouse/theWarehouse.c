#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,n;
	char S[100001];
	long long int min;
	long long int a[6][3];
	long long int ans[6];

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%s",S);
		n = strlen(S);

		for(int i=0;i<n;i++){
			assert(S[i]=='r' || S[i]=='g' || S[i]=='b');
		}

		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				a[i][j] = 0;
			}
			ans[i] = 0;
		}

		for(int i=0;i<n;i++){
			if(S[i]=='r'){
				ans[0] += a[0][1]+a[0][2];
				ans[1] += a[1][1]+a[1][2];
				ans[2] += 0;
				ans[3] += 0;
				ans[4] += a[4][2];
				ans[5] += a[5][1];

				a[0][0] += 1;
				a[1][0] += 1;
				a[2][0] += 1;
				a[3][0] += 1;
				a[4][0] += 1;
				a[5][0] += 1;
			}else if(S[i]=='b'){
				ans[0] += a[0][2];
				ans[1] += 0;
				ans[2] += a[2][0]+a[2][2];
				ans[3] += a[3][0];
				ans[4] += a[4][0]+a[4][2];
				ans[5] += 0;

				a[0][1] += 1;
				a[1][1] += 1;
				a[2][1] += 1;
				a[3][1] += 1;
				a[4][1] += 1;
				a[5][1] += 1;
			}else{
				ans[0] += 0;
				ans[1] += a[1][1];
				ans[2] += a[2][0];
				ans[3] += a[3][0]+a[3][1];
				ans[4] += 0;
				ans[5] += a[5][0]+a[5][1];

				a[0][2] += 1;
				a[1][2] += 1;
				a[2][2] += 1;
				a[3][2] += 1;
				a[4][2] += 1;
				a[5][2] += 1;
			}
		}

		min = ans[0];

		for(int i=1;i<6;i++){
			if(min>ans[i]){
				min = ans[i];
			}
		}

		printf("%lld\n",min);

		T--;
	}
	
	return 0;
}