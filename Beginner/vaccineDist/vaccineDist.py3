import math

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,D = map(int,input().split())

	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^4"
	assert(D>=1 and D<=100000), "D must be 1 <= D <= 10^5"

	risk = 0
	ans = 0

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100), "A["+str(i)+"] must be 1 <= A[i] <= 100"

		if (A[i]>=80 or A[i]<=9):
			risk += 1

	ans += math.ceil(risk/D) + math.ceil((N-risk)/D)
	print(ans)

	T -= 1