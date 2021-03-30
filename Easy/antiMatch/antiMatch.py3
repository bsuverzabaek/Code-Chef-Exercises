T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^4"
	assert(M>=0 and M<=10000), "M must be 0 <= M <= 10^4"

	adjList = [[0]*(N-1)]*N
	edgeCnt = [0]*N

	for i in range(0,M):
		u,v = map(int,input().split())

		assert(u>=1 and u<=N), "u must be 1 <= u <= N"
		assert(v>=1 and v<=N), "v must be 1 <= v <= N"
		assert(u!=v), "u must not equal v"

		adjList[u-1][edgeCnt[u-1]] = v-1
		adjList[v-1][edgeCnt[v-1]] = u-1

		edgeCnt[u-1] += 1
		edgeCnt[v-1] += 1

	max = 0

	for i in range(0,N):
		if (edgeCnt[i]>max):
			max = edgeCnt[i]

	if (max==2):
		tri = 0

		for i in range(0,N):
			if (edgeCnt[i]==2):
				v1 = adjList[i][0]
				v2 = adjList[i][1]

				for j in range(0,edgeCnt[v1]):
					if (adjList[v1][j]==v2):
						tri = 1
						break

		if (tri!=0):
			max = 3

	print(max)

	T -= 1