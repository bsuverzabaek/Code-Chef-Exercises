#include <stdio.h>
#include <assert.h>

int main(void){
	int T,count;
	int times[10][10];

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		count = 0;

		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				scanf("%d",&times[i][j]);
				assert(times[i][j]>=1 && times[i][j]<=60);

				if(times[i][j]<=30){
					count++;
				}
			}
		}

		if(count>=60){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}

	return 0;
}