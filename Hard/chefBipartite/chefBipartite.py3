T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	n,m,d,D = map(int,input().split())

	assert(n>=1 and n<=100), "n must be 1 <= n <= 100"
	assert(m>=0 and m<=n*n), "m must be 0 <= m <= n*n"
	assert(d>=1 and d<=D), "d must be 1 <= d <= D"
	assert(D>=d and D<=n), "D must be d <= D <= n"

	if ((m//n<d) or (m+n-1)//n>D):
		print(-1)
	else:
		vertex = 1
		offset = 0

		for i in range(0,m):
			print(str(vertex) + " " + str(1+(vertex-1+offset)%n))
			vertex += 1

			if (vertex>n):
				vertex = 1
				offset += 1

	T -= 1