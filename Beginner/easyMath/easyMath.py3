import math

def sumDig(N):
	sum = 0

	while (N>0):
		sum += N%10
		N = math.trunc(N/10)

	return sum

def max(a,b):
	if (a>b):
		return a
	else:
		return b

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100), "N must be 2 <= N <= 100"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=10000), "A["+str(i)+"] must be 1 <= A[i] <= 10^4"

	ans = 0

	for i in range(0,N):
		for j in range(i+1,N):
			prod = A[i] * A[j]
			sum = sumDig(prod)
			ans = max(ans,sum)

	print(ans)

	T -= 1