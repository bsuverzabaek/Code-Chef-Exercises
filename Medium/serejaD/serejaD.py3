def lowerBound(a,high,t):
	l = 0

	while (high>=l):
		mid = (l+high)//2

		if (a[mid]>=t):
			high = mid-1
		else:
			l = mid+1

	return l

n = int(input())
assert(n>=1 and n<=100000), "n must be 1 <= n <= 10^5"

a = (list(map(int,input().split())))[:n]

for i in range(0,n):
	assert(a[i]>=1 and a[i]<=1000000), "a["+str(i)+"] must be 1 <= a[i] <= 10^6"

m = int(input())
assert(m>=1 and m<=100000), "m must be 1 <= m <= 10^5"

while (m>0):
	t,d = map(int,input().split())

	assert(t>=a[0] and t<=1000000), "t must be a[0] <= t <= 10^6"
	assert(d>=0 and d<=1000000), "d must be 0 <= d <= 10^6"

	q1 = lowerBound(a,n-1,t)

	if (q1>=n or a[q1]>t):
		q1 -= 1

	while (q1>0 and a[q1-1]+d>=a[q1]):
		q2 = lowerBound(a,q1-1,a[q1]-d)
		q1 = q2

	print(q1+1)

	m -= 1