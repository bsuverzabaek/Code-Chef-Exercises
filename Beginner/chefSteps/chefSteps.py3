T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	D = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(D[i]>=1 and D[i]<=1000000000), "D["+str(i)+"] must be 1 <= D[i] <= 10^9"

		if (D[i]%K==0):
			print("1",end='')
		else:
			print("0",end='')

	print()

	T -= 1