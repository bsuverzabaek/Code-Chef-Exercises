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

	count = 0

	count += math.trunc(N/100)
	N %= 100
	count += math.trunc(N/50)
	N %= 50
	count += math.trunc(N/10)
	N %= 10
	count += math.trunc(N/5)
	N %= 5
	count += math.trunc(N/2)
	N %= 2
	count += math.trunc(N/1)

	print(count)
				
	T -= 1