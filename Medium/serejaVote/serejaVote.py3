import sys

while (1):
	T = int(input())

	if (T<=0 or T>50):
		print("T must be 1 <= T <= 50")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>10000):
			print("N must be 1 <= N <= 10000");
		else:
			break

	B = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		if (B[i]<0 or B[i]>1000):
			print("B["+str(i)+"] must be 0 <= B[i] <= 1000")
			sys.exit(0)

	sum = 0
	over = 0
	count = 0

	for i in range(0,N):
		if (B[i]>100):
			over = 1
		elif (B[i]>0):
			count += 1

		sum += B[i]

	if (over==0 and sum-100>=0 and sum-100<count):
		print("YES")
	else:
		print("NO")
				
	T -= 1