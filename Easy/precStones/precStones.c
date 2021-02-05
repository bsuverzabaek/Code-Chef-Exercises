#include <stdio.h>
#include <string.h>
#include <assert.h>

int main(void){
	int T,l,j1,j2,sp,ans;
	int l1=0,l2=0,lt=1,singl=0;
	char S[100000];

	scanf("%d",&T);
	assert(T>=1 && T<=2500);

	for(int i=1;i<=T;i++){
		scanf("%s",S);

		for(int i=0;i<strlen(S);i++){
			assert(S[i]=='A' || S[i]=='R');
		}

		l = strlen(S);
		j1 = 1;

		while(S[0]==S[j1]){
			j1++;
		}

		if(j1==l){
			if(j1==1){
				printf("Case %d: %d\n",i,1);
			}else{
				printf("Case %d: %d\n",i,l-1);
			}

			goto last;
		}

		sp = j1;

		do{
			j2 = j1;
			lt = 1;

			if(j2==l-1){
				j2 = -1;
			}

			while(S[j1]==S[j2+1]){
				lt++;
				j2++;

				if(j2==l-1){
					j2 = -1;
				}
			}

			if(lt==1){
				singl++;
			}

			if(lt>l2){
				l2 = lt;

				if(l2>l1){
					lt = l1;
					l1 = l2;
					l2 = lt;
				}
			}

			j1 = j2 + 1;

		}while(sp!=j1);

		if(l1>2){
			l1 /= 2;

			if(l1>l2){
				printf("Case %d: %d\n",i,l1);
			}else{
				printf("Case %d: %d\n",i,l2);
			}

			goto last;
		}

		if(l1==1){
			if(singl==2){
				printf("Case %d: %d\n",i,2);
			}else{
				printf("Case %d: %d\n",i,3);
			}

			goto last;
		}

		if(l1==2){
			if(singl>0){
				printf("Case %d: %d\n",i,2);
			}else{
				printf("Case %d: %d\n",i,3);
			}
		}

		last:
			singl = 0;
			l1 = l2 = 0;
	}

	return 0;
}