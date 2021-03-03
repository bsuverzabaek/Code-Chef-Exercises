def solve(x):
	N = x[0]
	A = x[1]

	know = A[0]
	add = A[0]
	day = 1

	if (A[0]+1>=N):
		return 1

	while (know+1<N):
		m = 0

		for i in range(know-add+1,know+1):
			m += A[i]
			know += A[i]

		know += add
		add += m
		day += 1

	return day 

T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"
	sumN += N

	if (T==1):
		assert(sumN<=1000000), "Sum of N must be <=10^6"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=N), "A["+str(i)+"] must be 0 <= A[i] <= N"

	assert(A[0]>=1), "A[0] must be 1 <= A[0]"

	lis = []
	lis.append((N,A))

	for i in lis:
		print(solve(i))

	T -= 1