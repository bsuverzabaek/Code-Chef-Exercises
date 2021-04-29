#include <stdio.h>
#include <assert.h>
#include <string.h>
#define MOD 1000000007

int main(void){
	long long int ans,prefix,x;
	char S[100005];

	scanf("%s",S);
	assert(strlen(S)>=1 && strlen(S)<=100000);

	ans = 0;
	ans += (long long int)('Z'-S[0]);

	prefix = 0;
	prefix = (long long int)('Z'-S[0]);

	for(int i=1;i<strlen(S);i++){
		x = (long long int)('Z'-S[i]);
		ans = (ans+((prefix+1)*x))%MOD;
		prefix = ((26*prefix)+x)%MOD;
	}

	printf("%lld\n",ans);

	return 0;
}