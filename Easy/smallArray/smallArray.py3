N,X = map(int,input().split())

assert(N>=1 and N<=1000), "N must be 1 <= N <= 10^3"
assert(abs(X)>=1 and abs(X)<=1000), "X must be 1 <= |X| <= 10^3"

sum = 0
A = (list(map(float,input().split())))[:N]

for i in range(0,N):
	assert(abs(A[i])<=1000), "|A["+str(i)+"]| must be |A[i]| <= 10^3"
	sum += A[i]

max_sum = -100000
min_end = -100000

for i in range(0,N):
	if (min_end<0):
		min_end = A[i]
	else:
		min_end += A[i]

	max_sum = max(min_end,max_sum)

total = (sum-max_sum)+(max_sum/X)
print("{:.2f}".format(total))