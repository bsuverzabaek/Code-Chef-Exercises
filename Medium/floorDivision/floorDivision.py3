T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

x = [0,1,2,2,3,3,0]

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	d = 0

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^18"

		while (A[i]>11):
			A[i] /= 12

		d ^= x[A[i]]

	if (d!=0):
		print("Henry")
	else:
		print("Derek")

	T -= 1