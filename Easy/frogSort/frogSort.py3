T = int(input())
assert(T>=1 and T<=20000), "T must be 1 <= T <= 2*10^4"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=4), "N must be 2 <= N <= 4"

	W = (list(map(int,input().split())))[:N]
	L = (list(map(int,input().split())))[:N]
	X = []

	for i in range(0,N):
		assert(W[i]>=1 and W[i]<=N), "W["+str(i)+"] must be 1 <= W[i] <= N"
		assert(L[i]>=1 and L[i]<=5), "L["+str(i)+"] must be 1 <= L[i] <= N"
		X.append(i)

	ans = 0

	for i in range(1,N+1):
		pos = -1

		for j in range(0,N):
			if (W[j]==i):
				pos = X[j]

		for j in range(0,N):
			while (W[j]>i and X[j]<=pos):
				X[j] += L[j]
				ans += 1
	
	print(ans)

	T -= 1