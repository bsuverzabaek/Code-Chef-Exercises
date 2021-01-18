import math

def revFunc(N):
	ans = 0

	while (N>0):
		rem = N%10
		ans = rem + ans * 10
		N = math.trunc(N/10)

	return ans

while (1):
	T = int(input())

	if (T<=0 or T>20):
		print("T must be 1 <= T <= 20")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>20000):
			print("N must be 1 <= N <= 20000")
		else:
			break

	if (N==revFunc(N)):
		print("wins")
	else:
		print("loses")
				
	T -= 1			