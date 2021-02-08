T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10000"

while (T>0):
	N,M = map(int,input().split())

	sumN = 0
	sumM = 0

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	assert(M>=1 and M<=100000), "M must be 1 <= M <= 10^5"

	sumN += N
	sumM += M

	if (T==1):
		assert(sumN>=1 and sumN<=100000), "Sum of N must be 1 <= sumN <= 10^5"
		assert(sumM>=1 and sumM<=100000), "Sum of M must be 1 <= sumM <= 10^5"

	index = list(map(int,input().split()))

	minM = min(index)
	maxM = max(index)
	ans = N*[0]

	for i in range(0,N):
		ans[i] = max(maxM-i,i-minM)
		print(str(ans[i]) + " ",end='')

	print()

	T -= 1