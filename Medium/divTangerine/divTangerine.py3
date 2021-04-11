T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	n,k,p = map(int,input().split())

	assert(n>=1 and n<=50000000), "n must be 1 <= n <= 5*10^7"
	assert(k>=1 and k<=min(500,n)), "k must be 1 <= k <= min(500,n)"
	assert(p>=1 and p<=min(500,n)), "p must be 1 <= p <= min(500,n)"

	a = []
	b = []

	for i in range(0,k):
		li,ri = map(int,input().split())

		assert(li>=1 and li<=n), "l["+str(i)+"] must be 1 <= l[i] <= n"
		assert(ri>=1 and ri<=n), "r["+str(i)+"] must be 1 <= r[i] <= n"

		a.insert(i,li)

	for i in range(0,p):
		ai,bi = map(int,input().split())

		assert(ai>=1 and ai<=n), "a["+str(i)+"] must be 1 <= a[i] <= n"
		assert(bi>=1 and bi<=n), "b["+str(i)+"] must be 1 <= b[i] <= n"

		b.insert(i,ai)

	for i in range(0,p):
		for j in range(0,k):
			if (b[i]==a[j]):
				break

			if (j==k-1):
				j += 1	

		if (j==k):
			print("No")
			break

		if (i==p-1):
			i += 1

	if (i==p):
		print("Yes")

	T -= 1