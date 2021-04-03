T = int(input())
assert(T>=1 and T<=250), "T must be 1 <= T <= 250"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=10), "N must be 1 <= N <= 10"
	assert(K>=1 and K<=100000000), "K must be 1 <= K <= 100000000"

	cost = []
	weight = []

	for i in range(0,N):
		costi,weighti = map(int,input().split())

		assert(costi>=1 and costi<=100000000), "cost["+str(i)+"] must be 1 <= cost[i] <= 100000000"
		assert(weighti>=1 and weighti<=100000000), "weight["+str(i)+"] must be 1 <= weight[i] <= 100000000"

		cost.append(costi)
		weight.append(weighti)

	p = 2**N
	subset = [0]*10
	ans = -1

	for i in range(0,p):
		q = i
		l = 0

		while (l<N):
			if ((q&1)==1):
				subset[l] = 1;
			else:
				subset[l] = 0;
			
			q >>= 1
			l += 1

		c = 0
		w = 0

		for j in range(0,N):
			if (subset[j]==1):
				c += cost[j]
				w += weight[j]

		if (c<=K and w>ans):
			ans = w

	print(ans)

	T -= 1