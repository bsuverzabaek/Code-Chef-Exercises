T = int(input())
assert(T>=1 and T<=40), "T must be 1 <= T <= 40"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	count = 0
	fail = 0
	total = 0

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=2 and A[i]<=5), "A["+str(i)+"] must be 2 <= A[i] <= 5"

		total += A[i]

		if (A[i]==5):
			count = 1
		elif (A[i]==2):
			fail = 1

	avg = float(total)/float(N)

	if (avg>=4.0 and count==1 and fail==0):
		print("Yes")
	else:
		print("No")

	T -= 1