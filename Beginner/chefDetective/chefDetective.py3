N = int(input())
assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

B = [0]*100001
R = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(R[i]>=0 and R[i]<=N), "R["+str(i)+"] must be 0 <= R[i] <= N"
	B[R[i]] = 1

for i in range(0,N+1):
	if (B[i]==0):
		print(str(i) + " ",end='')

print()