T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	W = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(W[i]>=0 and W[i]<=10000), "W["+str(i)+"] must be 0 <= W[i] <= 10^4"

	print(sum(W)-(min(W)*N))

	T -= 1