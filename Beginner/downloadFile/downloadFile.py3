TC = int(input())
assert(TC>=1 and TC<=1000), "T must be 1 <= TC <= 1000"

while (TC>0):
	N,K = map(int,input().split())
	assert(N>=1 and N<=10), "N must be 1 <= N <= 10"

	T = []
	D = []

	for i in range(0,N):
		ti,di = map(int,input().split())

		assert(ti>=1 and ti<=10), "T["+str(i)+"] must be 1 <= T[i] <= 10"
		assert(di>=1 and di<=10), "T["+str(i)+"] must be 1 <= T[i] <= 10"

		T.insert(i,ti)
		D.insert(i,di)

	sum = 0
	for i in range(0,N):
		sum += T[i]
	assert(K>=0 and K<=sum), "K must be 0 <= K <= sum of T[i]"

	ans = 0

	for i in range(0,N):
		if (T[i]<K):
			K -= T[i]
		else:
			ans += (T[i]-K)*D[i]
			K = 0

	print(ans)

	TC -= 1