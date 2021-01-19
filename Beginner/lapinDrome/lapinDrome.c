#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main(void){
	int T,L;
	char S[1000];
	bool ans;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100){
			printf("T must be 1 <= T <= 100\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%s",S);

			if(strlen(S)==1){
				printf("String S must be at least 2 characters in length\n");
			}else{
				break;
			}
		}

		L = strlen(S);
		int left[500] = {0};
		int right[500] = {0};

		for(int i=0;i<L;i++){
			if(i<L/2){
				left[S[i]-'a']++;
			}
			if(i>=((L+1)/2)){
				right[S[i]-'a']++;
			}
		}

		ans = true;

		for(int c=0;c<26;c++){
			if(left[c]!=right[c]){
				ans = false;
				break;
			}
		}

		if(ans==true){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}

	return 0;
}