#include <stdio.h>
#include <string.h>

int main(void){
	int N,K,x,count;
	char s[100];

	while(1){
		scanf("%d %d",&N,&K);

		if(N<=0 || N>1000 || K<=0 || K>1000){
			printf("N and K must be 1 <= N,K <= 1000\n");
		}else{
			break;
		}
	}

	int tweet[N];

	for(int i=0;i<N;i++){
		tweet[i] = 0;
	}

	count = 0;

	while(K--){
		
		scanf("%s",s);

		if(strcmp(s,"CLICK")==0){
			while(1){
				scanf("%d",&x);

				if(x<=0 || x>N){
					printf("Tweet number must be 1 <= x <= N\n");
				}else{
					break;
				}
			}
			if(tweet[x-1]==0){
				count++;
				tweet[x-1] = 1;
			}else{
				count--;
				tweet[x-1] = 0;
			}
		}else if(strcmp(s,"CLOSEALL")==0){
			count = 0;

			for(int i=0;i<N;i++){
				tweet[i] = 0;
			}
		}

		printf("%d\n",count);
	}

	return 0;
}