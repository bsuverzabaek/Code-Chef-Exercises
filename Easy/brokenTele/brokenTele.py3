T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100000), "N must be 1 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]
	count = 0

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

	for i in range(1,N-1):
		if (A[i]!=A[i-1] or A[i]!=A[i+1]):
			count += 1
		

		if (i==1 and A[i-1]!=A[i]):
			count += 1
	

		if (i==N-2 and A[i+1]!=A[i]):
			count += 1

	print(count)

	T -= 1