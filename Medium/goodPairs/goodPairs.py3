T = int(input())
assert(T>=1 and T<=20), "T must be 1 <= T <= 20"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000000), "N must be 1 <= N <= 10^6"

	sumN += N

	if (T==1):
		assert(sumN>=1 and sumN<=1000000), "Sum of N must be <= 10^6"

	A = (list(map(int,input().split())))[:N]
	d = {}

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=1000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^6"
		
		if (A[i] not in d):
			d[A[i]] = 1
		else:
			d[A[i]] += 1

	ans = 0

	for i in d.keys():
		ans += d[i]*(d[i]-1)

		for j in d.keys():
			if (i!=j and (i|j)<=max(i,j)):
				ans += d[i]*d[j]

	print(ans//2)

	T -= 1