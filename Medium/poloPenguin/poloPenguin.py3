T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 100000"

	sumN += N

	if (T==1):
		assert(sumN<=100000), "Sum of N must be <=100000"

	A = (list(map(int,input().split())))[:N]
	prev = 0

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=1000000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^9"
		A[i] = prev^A[i]
		prev = A[i]

	ans = 0

	for i in range(0,32):
		p = 1
		p <<= i
		ones = 0

		for j in range(0,N):
			if ((p&A[j])!=0):
				ones += 1

		ans += (ones)*(N+1-ones)*p

	print(ans)

	T -= 1