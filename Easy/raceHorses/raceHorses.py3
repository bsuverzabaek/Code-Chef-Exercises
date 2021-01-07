while (1):
	T = int(input())

	if (T<=0 or T>10):
		print("T must be 1 <= T <= 10")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=1 or N>5000):
			print("N must be 2 <= N <= 5000")
		else:
			break

	S = list(map(int,input().split()))

	for i in range(0,N):
		while (1):
			if (S[i]<=0 or S[i]>1000000000):
				print("S["+str(i)+"] must be 1 <= S[i] <= 10^9")
			else:
				break

	S.sort()
	min = 1000000000

	for i in range(1,N):
		if (S[i]-S[i-1]<min):
			min = S[i]-S[i-1]

	print(min)

	T -= 1