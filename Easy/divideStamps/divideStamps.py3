N = int(input())
assert(N>=1 and N<=100000), "N must be 1 <= N <= 100000"

C = list(map(int,input().split()))[:N]

for i in range(0,N):
	assert(C[i]>=1 and C[i]<=1000000000), "C["+str(i)+"] must be 1 <= C[i] <= 10^9"

if (sum(C)==N*(N+1)/2):
	print("YES")
else:
	print("NO")