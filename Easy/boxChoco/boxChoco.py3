T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000 and N%2==0), "N must be 1 <= N <= 10^5 and even"

	W = (list(map(int,input().split())))[:N]
	m = 0

	for i in range(0,N):
		assert(W[i]>=1 and W[i]<=100000), "W["+str(i)+"] must be 1 <= W[i] <= 10^5"

		if (W[i]>W[m]):
			m = i

	count = 0
	gap = 0

	for i in range(m+1,m+N+1):
		if (W[i%N]==W[m]):
			count += max(0,gap-N//2+1)
			gap = 0
		else:
			gap += 1

	print(count)

	T -= 1