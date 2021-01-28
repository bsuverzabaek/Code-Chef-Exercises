T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	l,r,k = map(int,input().split())

	assert(l>=1 and l<=r and r<=100), "l and r must be 1 <= l <= r <= 100"
	assert(k>=1 and k<=100), "k must be 1 <= k <= 100"

	if (l==r):
		print(1)
	else:
		print(k)

	T -= 1