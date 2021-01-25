T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=10), "N must be 1 <= N <= 10"

	A = (list(map(int,input().split())))[:N]

	sum = 0

	for i in range(0,N):
		assert(abs(A[i])<=100), "Absolute value of A["+str(i)+"] must be <= 100"
		sum += A[i]

	if (sum>=0):
		print("YES")
	else:
		print("NO")

	T -= 1