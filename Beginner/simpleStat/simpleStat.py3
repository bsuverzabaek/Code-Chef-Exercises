T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^4"
	assert(2*K>=0 and 2*K<N), "K must be 0 <= 2K < N"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=-1000000 and A[i]<=1000000), "A["+str(i)+"] must be -10^6 <= A[i] <= 10^6"

	A.sort()
	sum = 0

	for i in range(K,N-K):
		sum += A[i]

	print(f"{sum/(N-K*2):.6f}")

	T -= 1