N,K = map(int,input().split())

assert(N>=1 and N<=1000000), "N must be 1 <= N <= 1000000"
assert(K>=2 and K<=100000), "K must be 2 <= K <= 100000"

A = (list(map(int,input().split())))[:N]

for i in range(0,len(A)):
	assert(A[i]>=1 and A[i]<=1000000), "A["+str(i)+"] must be 1 <= A[i] <= 1000000"

B = []
B.append(N-1)

ans = 1
MOD = 1000000007

for i in range(N-2,-1,-1):
	while (len(B)!=0 and A[i]<=A[B[-1]]):
		B.pop()
	
	if (len(B)!=0):
		ans *= (B[-1]-i+1)%MOD

	B.append(i)

print(ans)