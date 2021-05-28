N = int(input())
assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

a = (list(map(int,input().split())))[:N]
b = (list(map(int,input().split())))[:N]
c = []

for i in range(0,N):
	k = 0

	while (a[i]!=b[k]):
		k += 1

	c.insert(i,k)

min = 0

for i in range(0,N-1):
	for j in range(0,N-1):
		if (c[j]>c[j+1]):
			temp = c[j]
			c[j] = c[j+1]
			c[j+1] = temp
			min += 1

print(min)