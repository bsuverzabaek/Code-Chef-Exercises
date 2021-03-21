def F(X):
	if (X%9==0):
		return 9
	else:
		return X%9

T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	A,D,L,R = map(int,input().split())

	assert(A>=1 and A<=1000000000), "A must be 1 <= A <= 10^9"
	assert(D>=0 and D<=1000000000), "D must be 0 <= D <= 10^9"
	assert(L>=1 and L<=R), "L must be 1 <= L <= R"
	assert(R>=1 and R<=1000000000000000000), "R must be 1 <= R <= 10^18"

	A = F(A)
	D = F(D)
	K = (R-L+1)//9

	sum = 0

	for i in range(0,9):
		sum += F(A+i*D)

	sum *= K

	for i in range(L,R-(K*9)+1):
		sum += F(A+(i-1)*D)

	print(sum)

	T -= 1