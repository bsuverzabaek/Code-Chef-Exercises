#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,n1,n2,t,u;
	char s[51],s2[51],temp1[51],temp2[51];

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%s",s);
		scanf("%s",s2);

		n1 = strlen(s);
		n2 = strlen(s2);

		assert(n1>=1 && n1<=50);
		assert(n2>=1 && n2<=50);

		t = 0;
		u = 0;

		for(int i=0;i<n1;i++){
			assert(s[i]>=97 && s[i]<=122);

			if(s[i]!=s[i-1]){
				temp1[t] = s[i];
				t++;
			}
		}

		temp1[t] = '\0';

		for(int i=0;i<n2;i++){
			assert(s2[i]>=97 && s2[i]<=122);

			if(s2[i]!=s2[i-1]){
				temp2[u] = s2[i];
				u++;
			}
		}

		temp2[u] = '\0';

		if(strcmp(temp1,temp2)==0){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		T--;
	}
	
	return 0;
}