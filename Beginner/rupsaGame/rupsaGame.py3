T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 100000"

	P = (list(map(int,input().split())))[:N+1]
	assert(P[0]>=1 and P[0]<=1000000000), "Integers must be 1 <= P <= 10^9"

	Q = 2 * P[0]
	R = 0
	S = 2

	for i in range(1,N+1):
		assert(P[i]>=1 and P[i]<=1000000000), "Integers must be 1 <= P <= 10^9"

		R *= 2
		R += Q*P[i]
		R %= 1000000007

		Q += S * P[i]
		Q %= 1000000007

		S *= 2
		S %= 1000000007

	print(R)

	T -= 1