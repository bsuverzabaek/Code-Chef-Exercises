T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=1000000000000000000), "N must be 1 <= N <= 10^18"
	assert(M>=1 and M<=1000000000000000000), "M must be 1 <= M <= 10^18"

	X = max(N,M)
	Y = min(N,M)
	k = 0

	while (1):
		k += 1

		if (X==Y):
			print("Ari")
			break
		elif (Y==0):
			if (k%2==1):
				print("Ari")
				break
			else:
				print("Rich")
				break
		elif (X/Y>=2):
			if (k%2==1):
				print("Ari")
				break
			else:
				print("Rich")
				break

		r = X
		X = Y
		Y = r%Y

	T -= 1