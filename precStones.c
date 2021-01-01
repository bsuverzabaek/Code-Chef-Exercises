//This code has problems when B=2
//Segmentation fault also occurs

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct{
	int *Data;
	int Size;
	int Count;
} Stack;

Stack *CreateStack(int size){
	Stack *A = (Stack*)malloc(sizeof(Stack));
	A->Data = (int*)malloc(sizeof(int)*size);
	A->Size = size;
	A->Count = 0;

	if(A==NULL){
		printf("Cannot allocate memory\n");
		exit(1);
	}else{
		return A;
	}
}

void PushStack(Stack *A, int x){
	if(A->Count == A->Size){
		printf("Stack Overflow\n");
		exit(1);
	}

	A->Data[A->Count] = x;
	A->Count++;
}

int stackCount(Stack *A){
	return A->Count;
}

bool compFunc(Stack *A){
	if(A->Data[0] == A->Data[stackCount(A)]){
		return true;
	}else{
		return false;
	}
}

void addEl(Stack *A){
	A->Data[0] += A->Data[stackCount(A)];
}

int maxFunc(Stack *A){
	int max = 0;
	for(int i=0;i<A->Count;i++){
		if(A->Data[i]>max){
			max = A->Data[i];
		}
	}
	return max;
}

void copyFunc(Stack *A, Stack *A_copy){
	for(int i=0;i<A->Count;i++){
		A_copy->Data[i] = A->Data[i];
		A_copy->Count++;
	}
}

void changeEl(Stack *A_copy, int B){
	for(int i=0;i<A_copy->Count;i++){
		if(A_copy->Data[i]==B){
			A_copy->Data[i]=0;
		}
	}
}

int maxFunc2(int a, int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

void PopStack(Stack *A){
	if(A->Count == 0){
		printf("Stack Underflow\n");
		exit(1);
	}

	A->Count--;
}

void DisposeStack(Stack *A){
	free(A->Data);
	free(A);
}

int main(void){
	int T;
	Stack *A;
	Stack *A_copy;

	while(1){
		printf("Input T: ");
		scanf("%d",&T);

		if(T<=0 || T>2500){
			printf("T must be 1 <= T <= 2500\n");
		}else{
			break;
		}
	}

	for(int t=1;t<=T;t++){
		char S[100000];
		scanf("%s",S);

		int N = strlen(S);

		A = CreateStack(N);
	
		int i = 0;

		while(i<N){
			int j = i + 1;

			while(j<N && S[i]==S[j]){
				j++;
			}

			PushStack(A,j-i);
			i = j;
		}

		if(stackCount(A)>1 && compFunc(A)){
			addEl(A);
			PopStack(A);
		}

		int B = maxFunc(A);
		int ans;

		if(stackCount(A)==1){
			if(B==1){
				ans = 1;
			}else{
				ans = B-1;
			}
		}else{
			if(B==1){
				if(stackCount(A)==2){
					ans = 2;
				}else{
					ans = 3;
				}
			}else if(B==2){
				if(stackCount(A)==1){
					ans = 2;
				}else{
					ans = 3;
				}
			}else{
				A_copy = CreateStack(N);
				copyFunc(A,A_copy);
				PopStack(A);
				changeEl(A_copy,B);
				int B1 = maxFunc(A_copy);
				ans = maxFunc2(B/2,B1);
			}
		}

		printf("Case %d: %d\n",t,ans);
	}

	DisposeStack(A);
	DisposeStack(A_copy);

	return 0;
}