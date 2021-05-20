T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	count = 0
	temp = N

	a = []
	b = []
	c = [0]*2002

	for i in range(0,N):
		ai,bi = map(int,input().split())

		assert(ai>=0 and ai<=bi), "a["+str(i)+"] must be 0 <= a[i] <= b[i]"
		assert(bi>=ai and bi<=2000), "b["+str(i)+"] must be a[i] <= b[i] <= 2000"

		a.insert(i,ai)
		b.insert(i,bi)

		c[b[i]] += 1

	for i in range(0,2002):
		if (c[i]!=0):
			count += 1
			j = 0

			for k in range(0,temp):
				if (b[k]<i or a[k]>i):
					a[j] = a[k]
					b[j] = b[k]
					j += 1
				else:
					c[b[k]] -= 1

			temp = j

	print(count)

	T -= 1