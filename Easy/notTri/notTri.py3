while (1):
	N = int(input())
	assert((N>=3 and N<=2000) or N==0), "N must be 0 or 3 <= N <= 2000"

	count = 0

	if (N==0):
		break
	else:
		L = list(map(int,input().split()))[:N]

		for i in range(0,N):
			assert(L[i]>=1 and L[i]<=1000000), "L["+str(i)+"] must be 1 <= L[i] <= 1000000"

		L.sort()

		for i in range(N-1,0,-1):
			l = 0
			r = N-1

			while (l<r):
				if (L[l]+L[r]<L[i]):
					count += r-l
					l += 1
				else:
					r -= 1

		print(count)