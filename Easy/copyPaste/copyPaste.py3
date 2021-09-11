T = int(input())
assert(T>=1 and T<=20), "T must be 1 <= T <= 20"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	A = [0]*100000
	count = 0

	ai = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(ai[i]>=1 and ai[i]<=100000), "A[i] must be 1 <= A[i] <= 10^5"

		A[ai[i]] += 1

		if (A[ai[i]]==1):
			count += 1

	print(count)

	T -= 1