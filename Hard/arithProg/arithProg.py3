count = [0]*30003
dist = [0]*30003

N = int(input())
assert(N>=3 and N<=100000), "N must be 3 <= N <= 30000"

ans = 0
val = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(val[i]>=1 and val[i]<=30000), "A["+str(i)+"] must be 1 <= A[i] <= 30000"

	count[val[i]] += 1
	ans += dist[val[i]]

	if (val[i]<15001):
		mRange = val[i]
	else:
		mRange = 30002-val[i]

	for j in range(1,mRange+1):
		dist[val[i]+j] += count[val[i]-j]
		dist[val[i]-j] += count[val[i]+j]

for i in range(0,30003):
	ans += (count[i]*(count[i]-1)*(count[i]-2))//6

print(ans)