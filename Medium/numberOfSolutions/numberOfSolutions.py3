def powMod(x,n,m):
	if (n==0):
		return 1
	else:
		p = powMod(x,n//2,m)

		if ((n&1)!=0):
			return (((p*p)%m)*x)%m
		else:
			return (p*p)%m

def noSol(x,u,N):
	if (u%N>=x):
		return u//N+1
	else:
		return u//N

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

MOD = 1000000007

while (T>0):
	upper,d,m,N = map(int,input().split())

	assert(upper>=1 and upper<=1000000000), "upper must be 1 <= upper <= 10^9"
	assert(d>=0 and d<=1000000000), "d must be 0 <= d <= 10^9"
	assert(m>=0 and m<N), "m must be 0 <= m < N"
	assert(N>=1 and N<=40), "N must be 1 <= N <= 40"

	A = []

	for i in range(0,N):
		if (i==0 and d==0):
			A.insert(i,1)
		elif (i==0 or i==1):
			A.insert(i,i)
		else:
			A.insert(i,powMod(i,d,N))

	ans = 0

	for i in range(0,N):
		for j in range(0,N):
			for k in range(0,N):
				if ((A[i]+A[j]+A[k])%N==m):
					ans = (ans + (((noSol(i,upper,N)*noSol(j,upper,N))%MOD)*noSol(k,upper,N))%MOD)%MOD

	print(ans)

	T -= 1