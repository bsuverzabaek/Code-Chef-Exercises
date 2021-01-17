def max(a,b):
	if (a>b):
		return a
	else:
		return b

while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	while (1):
		A,B = map(int,input().split())

		if (A<0 or A>1000000 or B<0 or B>1000000):
			print("A and B must be 0 <= A,B <= 1000000")
		else:
			break

	print(str(max(A,B)) + " " + str(A+B))
				
	T -= 1			