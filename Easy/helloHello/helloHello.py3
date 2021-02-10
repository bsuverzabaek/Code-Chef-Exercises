T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	D,U,N = map(float,input().split())
	N = int(N)

	assert(D>=0.5 and D<=10.0), "D must be 0.5 <= D <= 10.0"
	assert(U>=1 and U<=10000), "U must be 1 <= U <= 10000"
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	min = D*U
	ans = 0

	for i in range(0,N):
		M,R,C = map(float,input().split())

		assert(M>=1 and M<=36), "M must be 1 <= M <= 36"
		assert(R>=0.05 and R<D), "R must be 0.05 <= R < D"
		assert(C>=1 and C<=1000), "C must be 1 <= C <= 1000"

		if (C/M+(R*U)<min):
			min = C/M+(R*U)
			ans = i+1

	print(ans)

	T -= 1