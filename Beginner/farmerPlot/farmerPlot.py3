while (1):
	T = int(input())

	if (T<=0 or T>20):
		print("T must be 1 <= T <= 20")
	else:
		break

while (T>0):

	while (1):
		N,M = map(int,input().split())

		if (N<=0 or N>10000 or M<=0 or M>10000):
			print("M and N must be 1 <= M,N <= 10000")
		else:
			break

	a = N
	b = M

	while (a!=b):
		if (a>b):
			a-=b
		else:
			b-=a

	print((int(N/a))*(int(M/b)))
		
	T -= 1		