T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

	subLen = 0
	ans = N

	for i in range(1,N):
		if (A[i]>=A[i-1]):
			subLen += 1
		else:
			ans += (subLen*(subLen+1))//2
			subLen = 0

	ans += (subLen*(subLen+1))//2
	print(ans)

	T -= 1