T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

while (T>0):
	N,K = map(int,input().split())
	sumN = 0

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 100000"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	sumN += N
	count = 0
	A = (list(map(int,input().split())))[:N]

	if (T==1):
		assert(sumN>=1 and sumN<=100000), "Sum of N over all test cases must be 1 <= sumN <= 100000"

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=10000), "A["+str(i)+"] must be 1 <= A[i] <= 10000"

		if (A[i]+K>sum(A)-A[i]):
			count += 1

	print(count)

	T -= 1