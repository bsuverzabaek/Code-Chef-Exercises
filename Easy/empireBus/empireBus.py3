T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=2000000), "N must be 1 <= N <= 2*10^6"
	sumN += N

	if (T==1):
		assert(sumN<=2000000), "Sum of N must be <= 2*10^6"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

	for i in range(1,N):
		A[i] = min(A[i],A[i-1]+1)

	for i in range(N-2,-1,-1):
		A[i] = min(A[i],A[i+1]+1)

	print(*A)

	T -= 1