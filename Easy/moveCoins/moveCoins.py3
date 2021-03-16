T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"
	assert(K>=1 and K<=1000), "K must be 1 <= K <= 1000"

	X = []
	X.append(0)

	xi = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(xi[i]>=1 and xi[i]<=1000), "X["+str(i)+"] must be 1 <= X[i] <= 1000"
		X.append(xi[i])

	ans = 0
	X.sort()

	for i in range(N,0,-1):
		ans += (X[i]-X[i-1]-1)*((N-i)//K+1)

	print(ans)

	T -= 1