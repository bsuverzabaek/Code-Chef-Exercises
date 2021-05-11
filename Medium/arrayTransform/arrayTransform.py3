T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	n,K = map(int,input().split())

	assert(n>=2 and n<=100), "n must be 2 <= n <= 100"
	assert(K>=1 and K<=10), "K must be 1 <= K <= 10"

	A = (list(map(int,input().split())))[:n]

	for i in range(0,n):
		assert(A[i]>=0 and A[i]<=1000), "A["+str(i)+"] must be 0 <= A[i] <= 1000"

	eqCount = [0]*(K+1)

	for i in A:
		eqCount[i%(K+1)] += 1

	eqCount.sort(reverse=True)

	if (n-eqCount[0]>1):
		print("NO")
	else:
		print("YES")

	T -= 1