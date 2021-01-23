import math

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,K,V = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(K>=1 and K<=100), "K must be 1 <= K <= 100"
	assert(V>=1 and V<=100000), "V must be 1 <= V <= 10^5"

	sum = 0
	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 10^5"
		sum += A[i]

	x = (V*(N+K)-sum)/K

	if (x-math.ceil(x)==0 and x>0):
		print(int(x))
	else:
		print("-1")

	T -= 1