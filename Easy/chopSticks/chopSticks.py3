N,D = map(int,input().split())

assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
assert(D>=0 and D<=1000000000), "D must be 0 <= D <= 10^9"

L = []

for i in range(0,N):
	li = int(input())
	L.insert(i,li)
	assert(L[i]>=1 and L[i]<=1000000000), "L["+str(i)+"] must be 1 <= L[i] <= 10^9"

L.sort()
count = 0
i = 0

while (i<N-1):
	if ((L[i+1]-L[i])<=D):
		count += 1
		i += 2
	else:
		i += 1

print(count)