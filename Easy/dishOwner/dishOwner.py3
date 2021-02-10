def find(x):
	y = x

	while (x!=X[x]):
		x = X[x]

	while (y!=x):
		t = X[y]
		X[y] = x
		y = t

	return x

T = int(input())
assert(T>=1 and T<=25), "T must be 1 <= T <= 25"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^4"

	S = (list(map(int,input().split())))[:N]
	X = []

	for i in range(0,N):
		assert(S[i]>=0 and S[i]<=1000000), "S["+str(i)+"] must be 0 <= S[i] <= 10^6"
		X.append(i)

	Q = int(input())
	assert(Q>=1 and Q<=10000), "Q must be 1 <= Q <= 10^4"

	while (Q>0):
		query = list(map(int,input().split()))
		assert(query[0]==0 or query[0]==1), "l must be either 0 or 1"

		if (query[0]==0):
			assert(query[1]>=1 and query[1]<=N and query[2]>=1 and query[2]<=N), "x and y must be 1 <= x,y <= N"

			fx = find(query[1]-1)
			fy = find(query[2]-1)

			if (fx==fy):
				print("Invalid query!")
			else:
				if (S[fx]>S[fy]):
					X[fy] = fx
				elif (S[fx]<S[fy]):
					X[fx] = fy
		else:
			assert(query[1]>=1 and query[1]<=N), "x must be 1 <= x <= N"
			print(find(query[1]-1)+1)

		Q -= 1

	T -= 1