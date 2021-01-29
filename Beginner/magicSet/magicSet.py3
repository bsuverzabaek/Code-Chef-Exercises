T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	n,m = map(int,input().split())

	assert(n>=1 and n<=30), "n must be 1 <= n <= 30"
	assert(m>=1 and m<=1000), "m ust be 1 <= m <= 1000"

	a = (list(map(int,input().split())))[:n]
	count = 0

	for i in range(0,n):
		assert(a[i]>=1 and a[i]<=1000), "a["+str(i)+"] must be 1 <= a[i] <= 1000"

		if (a[i]%m==0):
			count += 1

	print(2**count-1)

	T -= 1