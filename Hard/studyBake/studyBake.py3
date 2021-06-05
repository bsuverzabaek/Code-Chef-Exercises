T = int(input())
sumN = 0

while (T>0):
	n = int(input())
	assert(n>=1 and n<=100000), "n must be 1 <= n <= 10^5"

	sumN += n
	assert(sumN<=500000), "Sum of n must be <= 5*10^5"

	x = []
	h = []
	ans = []

	for i in range(0,n):
		xi,hi = map(int,input().split())
		assert(xi>=1 and xi<=1000000), "x["+str(i)+"] must be 1 <= x[i] <= 10^6"
		assert(hi>=1 and hi<=1000000), "h["+str(i)+"] must be 1 <= h[i] <= 10^6"
		
		x.insert(i,xi)
		h.insert(i,hi)
		ans.insert(i,-2)

	for i in range(0,n-1):
		assert(x[i]<x[i+1]), "x[i] must be < x[i+1]"

	for i in range(n-2,-1,-1):
		if (h[i]<=h[i+1]):
			continue
		
		ans[i] = i+1
		tanV = (h[i+1]-h[i])/(x[i]-x[i+1])
		index = i+1

		for j in range(i+1,n):
			target = ans[index]

			if (target==-2):
				target = index+1
			
			if (target>=n or h[target]>=h[i]):
				break
			
			index = target
			greed = (h[target]-h[i])/(x[i]-x[target])

			if (tanV>=greed):
				ans[i] = target
				tanV = greed

	for i in range(0,n):
		print(str(ans[i]+1) + " ",end="")
	print()

	T -= 1