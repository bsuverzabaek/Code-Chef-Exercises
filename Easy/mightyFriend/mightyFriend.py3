T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10000"
	assert(K>=0 and K<=10000), "K must be 0 <= K <= 10000"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=10000), "Each element must be 1 <= a <= 10000"

	motu = A[0::2]
	tomu = A[1::2]

	l1 = len(motu)
	l2 = len(tomu)

	if (l1>l2):
		ll = l2
	else:
		ll = l1

	tomu.sort()
	motu.sort(reverse=True)

	i = 0

	while (sum(motu)>sum(tomu) and K>0 and i<ll):
		t = motu[i]
		motu[i] = tomu[i]
		tomu[i] = t

		i += 1
		K -= 1

	if (sum(tomu)>sum(motu)):
		print("YES")
	else:
		print("NO")

	T -= 1