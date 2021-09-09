t = int(input())
assert(t>=1 and t<=10), "t must be 1 <= t <= 10"

while (t>0):
	m,n = map(int,input().split())

	assert(m>=1 and m<=n), "m must be 1 <= m <= n"
	assert(n<=1000000000), "n must be <= 10^9"
	assert(n-m<=100000), "n-m must be <= 10^5"

	for i in range(m,n+1):
		if (i==1 or i==0):
			continue
		
		flag = 1

		j = 2
		while (j*j<=i):
			if (i%j==0):
				flag = 0
				break
			
			j += 1
		
		if (flag==1):
			print(i)

	print()

	t -= 1