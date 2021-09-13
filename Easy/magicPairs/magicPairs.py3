T = int(input())
assert(T>=1 and T<=4), "T must be 1 <= T <= 4"

while (T>0):
	n = int(input())
	assert(n>=1 and n<=100000), "n must be 1 <= n <= 100000"

	a = (list(map(int,input().split())))[:n]

	for i in range(0,n):
		assert(a[i]>=0 and a[i]<=1000000000), "a["+str(i)+"] must be 0 <= a[i] <= 10^9"

	d = (((n-1)*n)//2)
	print(d)

	T -= 1