def minimum(n,k):
	if (n<k):
		return n
	else:
		return k

while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	while (1):
		n,k = map(int,input().split())

		if (k<=0 or k>n):
			print("k must be 1 <= k <= n")
		elif (n<k or n>1000000):
			print("n must be k <= n <= 1000000")
		else:
			break

	n -= 1
	k -= 1
	R = 1
	N = 1

	for i in range(minimum(n-k,k)):
		R *= n-i
		N *= i+1

	print(R//N)

	T -= 1