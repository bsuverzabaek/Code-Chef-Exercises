T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(K>=1 and K<=100000), "K must be 1 <= K <= 10^5"

	A = (list(map(int,input().split())))[:N]
	sum = 0

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 10^5"
		sum += A[i]

	if (sum%K==0):
		print(0)
	else:
		print(1)

	T -= 1