def choose2(n):
	r = n
	return (r*(r-1))>>1

N = int(input())
assert(N<=100000), "N must be <= 10^5"

bitCounts = [0]*32

x = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(x[i]<=1000000000), "A["+str(i)+"] must be <= 10^9"

	for j in range(0,32):
		if ((x[i]&1)!=0):
			bitCounts[j] += 1
		
		x[i] >>= 1

r = 0
m = 0

for i in range(0,32):
	r += choose2(bitCounts[i])<<m
	m += 1

print(r)			