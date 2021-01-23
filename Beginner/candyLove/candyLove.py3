T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"

	A = (list(map(int,input().split())))[:N]
	sum = 0

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100), "A["+str(i)+"] must be 1 <= A[i] <= 100"
		sum += A[i]

	if (sum%2==0):
		print("NO")
	else:
		print("YES")

	T -= 1