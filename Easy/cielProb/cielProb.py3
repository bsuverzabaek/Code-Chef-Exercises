while (1):
	A,B = map(int, input().split())

	if (B<=0 or B>=A or A<=B or A>10000):
		print("A and B must be 1 <= B < A <= 10000")
	else:
		break

if ((A-B)%10==9):
	print(A-B-1)
else:
	print(A-B+1)