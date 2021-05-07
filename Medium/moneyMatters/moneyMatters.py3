import math

T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

a = []
b = []
c = []

while (T>0):
	N = int(input())
	assert(N<=1000000000), "N must be <= 10^9"

	a.insert(0,1)
	b.insert(0,0)
	len = 0

	if (((N+1)&N)!=0):
		sq = int(math.sqrt(float(N)))

		j = 0
		for i in range(1,sq+1):
			if ((N%(i+1))==i):
				a.insert(j,i)
				b.insert(j,1)
				c.insert(j,N//(a[j]+1))

				if (a[j]>=c[j]):
					break
				
				j += 1

		kl = j-1

		while (kl>=0):
			b.insert(j,1)
			a.insert(j,c[kl])
			j += 1
			kl -= 1

		len = b[0]

		for i in range(1,j):
			for k in range(i-1,-1,-1):
				if ((a[i]%(a[k]+1))==a[k]):
					b[i] += b[k]

			len += b[i]
		
	else:
		len = N//2

	print(len+1)

	T -= 1