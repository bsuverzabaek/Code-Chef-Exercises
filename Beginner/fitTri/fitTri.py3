while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 10^3")
	else:
		break

while (T>0):

	while (1):
		print("Input Base B: ",end='')
		B = int(input())

		if (B<=0 or B>10000):
			print("B must be 1 <= B <= 10^4")
		else:
			break

	B //= 2

	print((B*(B-1))//2)
				
	T -= 1