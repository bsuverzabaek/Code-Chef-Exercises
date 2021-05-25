N,K = map(int,input().split())
assert(N>=1 and N<=1000000), "N must be 1 <= N <= 10^6"

numberCount = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(numberCount[i]>=1 and numberCount[i]<=10000000), "Each type must be 1 <= type <= 10^7"

numberCount.sort()
next = numberCount[0]
counter = 1

for i in range(1,N):
	if ((numberCount[i]-next)>=K):
		counter += 1
		next = numberCount[i]

print(counter)