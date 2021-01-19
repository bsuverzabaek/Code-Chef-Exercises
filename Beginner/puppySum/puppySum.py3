while (1):
	T = int(input())

	if (T<=0 or T>16):
		print("T must be 1 <= T <= 16")
	else:
		break

while (T>0):

	while (1):
		D,N = map(int,input().split())

		if (D<=0 or D>4 or N<=0 or N>4):
			print("D and N must be 1 <= D,N <= 4")
		else:
			break

	sum = N

	while (D>=1):
		sum = sum*(sum+1)/2
		D -= 1

	print(int(sum))
				
	T -= 1			