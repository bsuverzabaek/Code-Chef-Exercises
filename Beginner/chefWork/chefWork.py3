T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=1000), "N must be 1 <= N <= 10^3"
	assert(K>=1 and K<=1000), "K must be 1 <= K <= 10^3"

	W = (list(map(int,input().split())))[:N]

	sum = 0
	count = 1

	for i in range(0,N):
		assert(W[i]>=1 and W[i]<=1000), "W["+str(i)+"] must be 1 <= W[i] <= 10^3"

		if (W[i]>K):
			count = -1
			break
		else:
			if (sum+W[i]>K):
				count += 1
				sum = W[i]
			else:
				sum += W[i]

	print(count)

	T -= 1