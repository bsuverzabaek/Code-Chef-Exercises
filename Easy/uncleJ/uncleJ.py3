while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>100):
			print("N must be 1 <= N <= 100")
		else:
			break

	A = list(map(int,input().split(None,N)))
	
	while (1):
		K = int(input())

		if (K<=0 or K>N):
			print("K must be 1 <= K <= N")
		else:
			break

	for i in range(0,N):
		if (K==i+1):
			temp = A[i]

	A.sort()

	for i in range(0,N):
		if (A[i]==temp):
			print(i+1)

	T -= 1