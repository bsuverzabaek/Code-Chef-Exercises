T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"
	assert(M>=1 and M<=1000), "M must be 1 <= M <= 1000"

	print(N*(M-1)+M*(N-1))

	T -= 1