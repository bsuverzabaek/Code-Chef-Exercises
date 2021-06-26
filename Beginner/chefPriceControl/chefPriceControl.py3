T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10000"
	assert(K>=1 and K<=1000), "K must be 1 <= K <= 1000"

	P = (list(map(int,input().split())))[:N]
	sum = 0

	for i in range(0,N):
		assert(P[i]>=1 and P[i]<=1000), "P["+str(i)+"] must be 1 <= P[i] <= 1000"

		if (P[i]>K):
			sum += P[i]-K

	print(sum)

	T -= 1