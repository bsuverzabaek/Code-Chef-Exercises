import sys
import math

while (1):
	T = int(input())

	if (T<=0 or T>100000):
		print("T must be 1 <= T <= 10^5")
	else:
		break

sum = 0

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>100000):
			print("N must be 1 <= N <= 10^5")
		else:
			break

	sum += N
				
	if (T==1 and sum>100000):
		print("The sum of N over all test cases must be <= 10^5")
		sys.exit(0)

	s = input()

	if (len(s)>N):
		print("String s must not exceed N")
		sys.exit(0)

	ans = 0
	count = 0

	for i in range(0,N):
		if (s[i]=='1'):
			count += 1

	ans = (count*(count+1))/2
	print(math.trunc(ans))

	T -= 1		