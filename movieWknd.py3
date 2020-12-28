while (1):
	T = int(input("Input T: "))

	if(T<=0 or T>5):
		print("T must be 1 <= T <= 5")
	else:
		break

while(T>0):
	
	while (1):
		n = int(input("Input n: "))

		if(n<=0 or n>100):
			print("T must be 1 <= n <= 100")
		else:
			break

	L = list(map(int,input().split()))

	for i in range(0,n):
		while (1):
			if(L[i]<=0 or L[i]>100):
				print("L["+str(i)+"] must be 1 <= L[i] <= 100")
			else:
				break

	R = list(map(int,input().split()))

	for i in range(0,n):
		while (1):
			if(R[i]<=0 or R[i]>100):
				print("R["+str(i)+"] must be 1 <= R[i] <= 100")
			else:
				break

	max = 0
	maxR = 0
	num = 0

	for i in range(0,n):
		if(L[i]*R[i]>max):
			max = L[i]*R[i]
			maxR = R[i]
			num = i
		elif(L[i]*R[i]==max and R[i]>maxR):
			maxR = R[i]
			num = i

	print(num+1)

	T -= 1