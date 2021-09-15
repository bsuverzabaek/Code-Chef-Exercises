T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	W = (list(map(int,input().split())))[:N]
	max = 0

	for i in range(0,N):
		assert(W[i]>=1 and W[i]<=1000000), "W["+str(i)+"] must be 1 <= W[i] <= 10^6"

		if (W[i]>max):
			max = W[i]

	for i in range(0,N):
		if (i+W[i]>max):
			max = i+W[i]

	print(max)

	T -= 1