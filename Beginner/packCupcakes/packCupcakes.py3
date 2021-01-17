while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=1 or N>100000000):
			print("N must be 2 <= N <= 10^8")
		else:
			break

	print((N//2)+1)
				
	T -= 1			