import math

while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>1000000):
			print("N must be 1 <= N <= 1000000")
		else:
			break

	sum = 0

	while (N>0):
		m = N%10
		sum += m
		N = math.trunc(N/10)

	print(sum)

	T -= 1