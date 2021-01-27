N,K = map(int,input().split())
assert((N>=1 and N<=200000) and (K>=1 and K<=200000)), "N and K must be 1 <= N,K <= 2*10^5"

if (N<=K):
	print("-1")
else:
	A = []
	s = 0

	for i in range(0,K):
		A.insert(i,1)
		s += A[i]
		s %= 1000000007

	for i in range(K,N):
		s %= 1000000007
		A.insert(i,s)
		s += A[i]
		s -= A[i-K]
		s %= 1000000007

	print(A[N-1])