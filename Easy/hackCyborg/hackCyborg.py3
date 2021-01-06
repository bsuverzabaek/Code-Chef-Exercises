def rangeMin(A,a,b):
	min = 1000000000

	for i in range(a,b+1):
		if (A[i]<min):
			min = A[i]

	return min 

while (1):
	T = int(input("Input T: "))

	if(T<=0 or T>100000):
		print("T must be 1 <= T <= 10^5")
	else:
		break

while (T>0):
	while (1):
		N,M = map(int, input().split())

		if(N<=0 or N>100000):
			print("N must be 1 <= N <= 10^5")
		elif (M<=0 or M>100000):
			print("M must be 1 <= M <= 10^5")
		else:
			break

	A = list(map(int,input().split()))

	for i in range(0,N):
		while (1):
			if (A[i]<=0 or A[i]>1000000000):
				print("A["+str(i)+"] must be 1 <= A[i] <= 10^9")
			else:
				break

	B = list(map(int,input().split()))

	for i in range(0,M):
		while (1):
			if (B[i]<=0 or B[i]>N):
				print("B["+str(i)+"] must be 1 <= B[i] <= N")
			else:
				break

	sum = 0

	for i in range(0,M):
		for j in range(i,M):
			sum += rangeMin(A,B[i]-1,B[j]-1)

	print(sum)

	T -= 1