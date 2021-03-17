import sys

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

sumN = 0
sumM = 0

while (T>0):
	N,M = map(int,input().split())

	assert(N>=3 and N<=1000), "N must be 3 <= N <= 1000"
	assert(M>=3 and M<=1000), "M must be 3 <= M <= 1000"

	sumN += N
	sumM += M

	if (T==1):
		assert(sumN<=1000), "Sum of N must be <=1000"
		assert(sumM<=1000), "Sum of M must be <=1000"

	max = -sys.maxsize-1
	G = [list(map(int,input().split())) for i in range(N)]

	for i in range(0,N):
		for j in range(0,M):
			assert(abs(G[i][j])<=1000000), "|G[i][j]| must be <=10^6"

	left = [[0 for j in range(M)] for i in range(N)]
	right = [[0 for j in range(M)] for i in range(N)]
	up = [[0 for j in range(M)] for i in range(N)]
	down = [[0 for j in range(M)] for i in range(N)]

	for i in range(0,N):
		max_upto = 0
		for j in range(0,M):
			if (max_upto>=0):
				max_upto += G[i][j]
				left[i][j] = max_upto
			else:
				max_upto = G[i][j]
				left[i][j] = max_upto

	for i in range(0,N):
		max_upto = 0
		for j in range(M-1,-1,-1):
			if (max_upto>=0):
				max_upto += G[i][j]
				right[i][j] = max_upto
			else:
				max_upto = G[i][j]
				right[i][j] = max_upto

	for j in range(0,M):
		max_upto = 0
		for i in range(0,N):
			if (max_upto>=0):
				max_upto += G[i][j]
				up[i][j] = max_upto
			else:
				max_upto = G[i][j]
				up[i][j] = max_upto

	for j in range(0,M):
		max_upto = 0
		for i in range(N-1,-1,-1):
			if (max_upto>=0):
				max_upto += G[i][j]
				down[i][j] = max_upto
			else:
				max_upto = G[i][j]
				down[i][j] = max_upto

	for i in range(1,N-1):
		for j in range(1,M-1):
			ans = (G[i][j]+left[i][j-1]+right[i][j+1]+up[i-1][j]+down[i+1][j])
			if (ans>max):
				max = ans

	print(max)

	T -= 1