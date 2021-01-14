import math

while (1):
	T = int(input())

	if (T<=0 or T>100000): 
		print("T must be 1 <= T <= 10^5")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<0 or N>1000000000):
			print("N must be 0 <= N <= 10^9")
		else:
			break

	count = 0

	while (N>0):
		if(N%10==4):
			count += 1

		N = math.trunc(N/10)

	print(count)

	T -= 1		