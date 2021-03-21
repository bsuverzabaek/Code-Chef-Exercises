#include <stdio.h>

int p_first(int* arr, int n){
	int p = 0;
	p += arr[0];

	if(n > 2){
		for(int i=3;i<n;i+=2){
			p += arr[i];
		}
	}

	return p;
}

int p_second(int* arr, int n){
	int p = 0;
	if(n == 1){
		return p;
	}else if(n == 2){
		p += arr[1];
		return p;
	}else if(n == 3){
		p += arr[1];
		p += arr[2];
		return p;
	}else{
		p += arr[1];
		p += arr[2];
		for(int i=4;i<n;i+=2){
			p += arr[i];
		}
		return p;
	}
}

int main(void){
	int T;
	printf("Input Test Cases: ");
	scanf("%d",&T);

	while(T>0){
		int n;
		printf("Input array size: ");
		scanf("%d",&n);

		int arr[n];

		for(int i=0;i<n;i++){
			scanf("%d",&arr[i]);
		}

		if(p_first(arr,n) == p_second(arr,n)){
			printf("draw\n");
		}else if(p_first(arr,n) > p_second(arr,n)){
			printf("first\n");
		}else{
			printf("second\n");
		}

		T--;
	}
	
	return 0;
}