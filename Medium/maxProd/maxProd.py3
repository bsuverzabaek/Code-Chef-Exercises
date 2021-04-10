T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

mod=1000000007

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=1000000000), "N must be 1 <= N <= 10^9"
	assert(K>=1 and K<=10000), "K must be 1 <= K <= 10^4"

	sum = (K*(K+1))//2
	ans = 1
	A = []

	if (N<sum):
		ans = -1
	elif (N==sum):
		ans = 0
	else:
		r = N-sum
		q = r//K

		for i in range(1,K+1):
			A.insert(i-1,i)

		for i in range(0,K):
			A[i] += q

		r -= q*K;
		j = K-1

		while (r!=0):
			A[j] += 1
			r -= 1
			j -= 1

		for i in range(0,K):
			ans = (((ans*(A[i]-1))%mod)*A[i])%mod

	print(ans)

	T -= 1