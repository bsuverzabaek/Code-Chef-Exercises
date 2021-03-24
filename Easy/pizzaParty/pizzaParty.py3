M,N = map(int,input().split())

assert(M>=1 and M<=200000), "M must be 1 <= M <= 2*10^5"
assert(N>=1 and N<=200000), "N must be 1 <= N <= 2*10^5"

A = (list(map(int,input().split())))[:M]

for i in range(0,M):
	assert(A[i]>=1 and A[i]<=200000), "A["+str(i)+"] must be 1 <= A[i] <= 1*10^5"

ans = 0
x = 0

for i in range(0,M):
	for j in range(0,M-i-1):
		if (A[j]>A[j+1]):
			temp = A[j]
			A[j] = A[j+1]
			A[j+1] = temp

		if (j==M-i-2):
			if (A[j+1]<=N and N!=0):
				ans += ((A[j+1]*(A[j+1]+1))//2)+1
				N -= A[j+1]
			elif (A[j+1]>N and N!=0):
				ans += ((N*(N+1))//2)+1
				N = 0

			if (j==0 and A[j]<=N and N!=0):
				ans += ((A[j]*(A[j]+1))//2)+1
				N -= A[j]
			elif (j==0 and A[j]>N and N!=0):
				ans += ((N*(N+1))//2)+1
				N = 0
			
			if (N==0):
				x = j+1
				break

	if (N==0):
		break

print(ans+x)	