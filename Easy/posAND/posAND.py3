T = int(input())
sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	sumN += N

	if (T==1):
		assert(sumN<=1000000), "Sum of N must be <= 10^6"

	if (N==1):
		print(1)
	elif ((N&-N)==N):
		print(-1)
	else:
		ans = []

		ans.append(2)
		ans.append(3)
		ans.append(1)

		z = 3

		for i in range(4,N+1):
			ans.insert(z,i)
			z += 1

		for i in range(3,N):
			if ((ans[i]&ans[i-1])==0):
				t = ans[i+1]
				ans[i+1] = ans[i]
				ans[i] = t

		print(*ans,end='')
		print()

	T -= 1