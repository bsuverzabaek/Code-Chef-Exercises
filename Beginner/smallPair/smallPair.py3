import sys

while (1):
	T = int(input())

	if (T<=0):
		print("T must be greater than 0")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=1):
			print("N must be greater than 1")
		else:
			break

	a = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		if (a[i]<=0 or a[i]>1000000):
			print("a["+str(i)+"] must be 1 <= a[i] <= 10^6")
			sys.exit(0)

	a.sort()

	print(a[0]+a[1])
		
	T -= 1			