def gcd(a,b):
	if (b==0):
		return a

	return gcd(b,a%b)

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]
	ans = 0

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 10^5"

	res = A[0]

	for i in range(1,N):
		res = gcd(res,A[i])

		if (res==1):
			ans = N
			break

	if (ans!=0):
		print(N)
	else:
		print(-1)

	T -= 1