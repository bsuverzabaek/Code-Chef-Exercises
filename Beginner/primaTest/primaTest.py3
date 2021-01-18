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

		if (N<=0 or N>100000):
			print("N must be 1 <= N <= 100000")
		else:
			break
	
	prime = 0

	for i in range(1,math.trunc(N/2)+1):
		if (N%i==0):
			prime += 1

	if (prime==1):
		print("yes")
	else:
		print("no")	

	T -= 1		