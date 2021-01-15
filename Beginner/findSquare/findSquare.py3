import math

while (1):
	T = int(input())

	if (T<=0 or T>20):
		print("T must be 1 <= T <= 20")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>10000):
			print("N must be 1 <= N <= 10000")
		else:
			break

	print(math.trunc(math.sqrt(N)))
				
	T -= 1			