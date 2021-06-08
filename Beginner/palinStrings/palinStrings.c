#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,flag;
	char A[1000],B[1000];

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%s",A);
		scanf("%s",B);

		int C1[26] = {0};
		int C2[26] = {0};

		flag = 0;

		for(int i=0;i<strlen(A);i++){
			C1[A[i]-'a']++;
		}

		for(int i=0;i<strlen(B);i++){
			C2[B[i]-'a']++;
		}

		for(int i=0;i<26;i++){
			if(C1[i]>0 && C2[i]>0){
				flag = 1;
				break;
			}
		}

		if(flag==1){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		T--;
	}
	
	return 0;
}