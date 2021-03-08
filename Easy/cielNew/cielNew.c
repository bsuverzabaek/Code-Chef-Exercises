#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	char S[1000001];
	int x,nonzero;
	long long int count;

	scanf("%s",S);
	count = 0;

	for(int i=0;i<strlen(S);i++){
		assert(S[i]>=48 && S[i]<=57);
		x = S[i]-'0';

		if(x%8==0){
			count++;
		}
	}

	for(int i=1;i<strlen(S);i++){
		if(S[i-1]=='0'){
			continue;
		}

		x = (S[i-1]-'0')*10+(S[i]-'0');

		if(x%8==0){
			count++;
		}
	}

	nonzero = 0;

	for(int i=2;i<strlen(S);i++){
		x = (S[i-2]-'0')*100+(S[i-1]-'0')*10+(S[i]-'0');

		if(S[i-2]!='0'){
			nonzero++;
		}

		if(x%8==0){
			count += nonzero;
		}
	}

	printf("%lld\n",count);

	return 0;
}