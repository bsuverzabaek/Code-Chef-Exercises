T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]
	d = 0

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=1000000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^9"
		d |= A[i]

	print(d)

	T -= 1