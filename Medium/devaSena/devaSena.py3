def binCount(a,b,m):
	res = 1

	while (b!=0):
		if ((b&1)!=0):
			res = (res*a)%m

		a = (a*a)%m
		b >>= 1

	return res

T = int(input())
assert(T>=1 and T<=30), "T must be 1 <= T <= 30"

mod = 1000000007

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	max1 = -1
	ans = 1

	A = [0]*100000
	S = [0]*100000

	x = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(x[i]>=1 and x[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 10^5"
		A[x[i]] += 1

		if (x[i]>max1):
			max1 = x[i]

	for i in range(max1,1,-1):
		p1 = A[i]
		p2 = 0

		j = 2

		while (i*j<=max1):
			p1 += A[i*j]
			p2 = (p2+S[i*j])%(mod-1)
			j += 1
		

		count = (binCount(2,p1,mod-1)-1-p2+mod-1)%(mod-1)
		ans = (ans*binCount(i,count,mod))%mod
		S[i] = count

	print(ans)

	T -= 1