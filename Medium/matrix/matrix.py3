N,M = map(int,input().split())

assert(N>=1 and N<=2000), "N must be 1 <= N <= 2000"
assert(M>=1 and M<=2000), "M must be 1 <= M <= 2000"

A = []
[A.append(input()) for i in range(N)]

for i in range(0,N):
	for j in range(0,M):
		assert(A[i][j]=='0' or A[i][j]=='1'), "Each character must be 0 or 1"

B = [0]*M
sum = 0

for i in range(N-1,-1,-1):
	temp = 0
	for j in range(0,M):
		if (A[i][j]=='1'):
			B[j] += 1
		else:
			B[j] = 0

		temp = min(temp+1,B[j])
		sum += temp

print(sum)