while (1):
	T = int(input("Input T: "))

	if(T<=0 or T>10):
		print("T must be 1 <= T <= 10")
	else:
		break

while (T>0):
	while (1):
		N,K = map(int, input().split())

		if (N>100 or N<K):
			print("N must be K <= N <= 100")
		elif (K<=0 or K>N):
			print("K must be 1 <= K <= N")
		else:
			break

	a = list(map(int,input().split()))

	for i in range(0,N):
		while (1):
			if (a[i]<=0 or a[i]>100):
				print("a["+str(i)+"] must be 1 <= a[i] <= 100")
			else:
				break

	max = 0

	for i in range(0,N-1):
		if (a[i]+a[i+1]>max):
			max = a[i] + a[i+1]

	print(max)

	T -= 1