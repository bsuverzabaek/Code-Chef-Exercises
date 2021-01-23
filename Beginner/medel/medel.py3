T = int(input())
assert(T>=1 and T<=74), "T must be 1 <= T <= 74"

while (T>0):
	N = int(input())
	assert(N>=3 and N<=19), "N must be 3 <= N <= 19"

	A = list(map(int,input().split()))[:N]

	max = 0
	min = 10000

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=109), "A["+str(i)+"] must be 1 <= A[i] <= 109"

		if (min>A[i]):
			min = A[i]
			a = i
				
		if (max<A[i]):
			max = A[i]
			b = i

	if (a<b):
		print(str(min) + " " + str(max))
	else:
		print(str(max) + " " + str(min))

	T -= 1