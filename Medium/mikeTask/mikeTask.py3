N,X = map(int,input().split())

assert(N>=1 and N<=1000000), "N must be 1 <= N <= 1000000"
assert(X>=0 and X<=1000000000000000), "X must be 0 <= X <= 10^15"

A = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

A.sort()

total = 0
failed = N
successful = 0

for i in range(0,N):
	if (A[i]%2!=0):
		total += A[i]//2+1
	else:
		total += A[i]//2

	if (total>X):
		if (A[i]%2!=0):
			total -= A[i]//2+1
		else:
			total -= A[i]//2

		break

	if (A[i]==1):
		successful += 1

	failed -= 1

for i in range(0,N):
	if (not(A[i]==1)):
		total += A[i]//2

		if (total>X):
			break

		successful += 1

print(str(failed) + " " + str(successful))