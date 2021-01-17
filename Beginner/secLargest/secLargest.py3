while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000");
	else:
		break

while (T>0):

	while (1):
		A,B,C = map(int,input().split())

		if (A<=0 or A>1000000):
			print("A must be 1 <= A <= 1000000")
		elif (B<=0 or B>1000000):
			print("B must be 1 <= B <= 1000000")
		elif (C<=0 or C>1000000):
			print("C must he 1 <= C <= 1000000")
		else:
			break

	if ((A>B and A<C) or (A>C and A<B)):
		print(A)
	elif ((B>A and B<C) or (B>C and B<A)):
		print(B)
	elif ((C>A and C<B) or (C>B and C<A)):
		print(C)
	
	T-= 1			