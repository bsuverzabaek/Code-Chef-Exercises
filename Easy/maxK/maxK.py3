N,K = map(int,input().split())

assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
assert(K>=1 and K<=min(N*(N+1)/2,100000)), "K must be 1 <= K <= min(N*(N+1)/2,10^5)"

A = (list(map(int,input().split())))[:N]
ans = []

for i in range(0,N):
	assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

for i in range(0,N):
	sum = 0
	for j in range(i,N):
		sum += A[j]
		ans.append(sum)

ans.sort(reverse=True)

for i in range(0,K):
	print(str(ans[i]) + " ",end='')

print()