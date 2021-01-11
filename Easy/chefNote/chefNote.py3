while (1):
	T = int(input())

	if (T<=0 or T>100000):
		print("T must be 1 <= T <= 10^5")
	else:
		break

while (T>0):

	while (1):
		X,Y,K,N = map(int,input().split())

		if (Y<=0 or Y>X):
			print("Y must be 1 <= Y < X")
		elif (X<Y or X>1000):
			print("X must be Y < X <= 10^3")
		elif (K<=0 or K>1000):
			print("K must be 1 <= K <= 10^3")
		elif (N<=0 or N>100000):
			print("N must be 1 <= N <= 10^5")
		else:
			break

	P = []
	C = []

	for i in range(0,N):
		while (1):
			pi,ci = map(int,input().split())

			if (pi<=0 or pi>1000):
				print("P["+str(i)+"] must be 1 <= P[i] <= 10^3")
			elif (ci<=0 or ci>1000):
				print("C["+str(i)+"] must be 1 <= C[i] <= 10^3")
			else:
				P.insert(i,pi)
				C.insert(i,ci)
				break

	X -= Y

	for i in range(0,N):
		if (P[i]>=X and K>=C[i]):
			print("LuckyChef")
			break
		elif (i==N-1):
			if (X>P[i] or C[i]>K):
				print("UnluckyChef")
			
	T -= 1