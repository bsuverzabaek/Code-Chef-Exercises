T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=50), "N must be 1 <= N <= 50"
	assert(M>=1 and M<=50), "M must be 1 <= M <= 50"

	mat = []
	a = []

	for i in range(0,N):
		x = (list(map(int,input().split())))[:M]

		for j in range(0,M):
			assert(x[j]>=1 and x[j]<=50), "All matrix values must be 1 <= mat[i][j] <= 50"
		
		mat.append(x)

	for i in range(0,N):
		a.insert(i,mat[i][M-1])

		for j in range(M-2,-1,-1):
			if (mat[i][j]>a[i]):
				a[i] = mat[i][j]
			else:
				a[i] = mat[i][j]-1

	res = 0

	for i in range(0,N):
		res ^= a[i]

	if (res!=0):
		print("FIRST")
	else:
		print("SECOND")

	T -= 1