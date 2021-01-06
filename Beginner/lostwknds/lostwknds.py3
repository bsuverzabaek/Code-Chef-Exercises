while (1):
	T = int(input("Input T: "))

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T > 0):
		
	A = list(map(int,input().split()))

	for i in range(0,5):
		while(1):
			if (A[i]<0 or A[i]>24):
				print("A[" + str(i) + "] must be 0 <= A[i] <= 24")
				A[i] = int(input("A[" + str(i) + "]: "))
			else:
				break

	while (1):
		P = int(input("Input P: "))

		if (P<=0 or P>24):
			print("P must be 1 <= P <= 24")
		else:
			break

	sum = 0

	for i in range(0,5):
		sum += A[i]

	if (P*sum > 120):
		print("Yes")
	else:
		print("No")

	T -= 1