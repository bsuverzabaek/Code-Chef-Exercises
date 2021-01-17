while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break
while (T>0):

	while (1):
		N = int(input())

		if (N<-20 or N>20):
			print("N must be -20 <= N <= 20")
		else:
			break

	if (N<10):
		print("Thanks for helping Chef!")
	else:
		print("-1")
			
	T -= 1