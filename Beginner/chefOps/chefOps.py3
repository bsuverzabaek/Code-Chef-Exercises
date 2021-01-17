while (1):
	T = int(input())

	if (T<=0 or T>10000):
		print("T must be 1 <= T <= 10000")
	else:
		break

while (T>0):

	while (1):
		A,B = map(int,input().split())

		if (A<=0 or A>1000000001 or B<=0 or B>1000000001):
			print("A and B must be 1 <= A,B <= 1000000001")
		else:
			break

	if (A<B):
		print("<")
	elif (A>B):
		print(">")
	else:
		print("=")
			
	T -= 1		