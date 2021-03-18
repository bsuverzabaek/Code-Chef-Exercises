T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	count = [0]*100001
	factors = [0]*100001

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 10^5"
		count[A[i]] += 1

	ans = 0

	for i in range(2,100001):
		if (factors[i]==0):
			for j in range(i,100001,i):
				factors[j] += 1
	
		tot = 0

		for j in range(i,100001,i):
			tot += count[j]
		
		ans = max(ans,tot*factors[i])

	print(ans)

	T -= 1