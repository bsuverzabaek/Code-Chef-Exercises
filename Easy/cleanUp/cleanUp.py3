while (1):
	T = int(input())

	if (T<=0 or T>50):
		print("T must be 1 <= T <= 50")
	else:
		break

while (T>0):

	while (1):
		n,m = map(int, input().split())

		if (m<0 or m>n):
			print("m must be 0 <= m <= n")
		elif (n<m or n>1000):
			print("n must be m <= n <= 1000")
		else:
			break

	done = list(map(int,input().split(None,m)))
	arr = list(bytearray(n))

	done.sort()

	for i in range(0,m):
		done[i] -= 1

	for i in range(0,m):
		for j in range(0,n):
			if (done[i]==j):
				arr[j] = 1

	count = 0

	for i in range(0,n):
		if (arr[i]==0):
			count += 1
			if (count%2!=0):
				print(str(i+1)+" ",end='')

	print(" ")
	count = 0

	for i in range(0,n):
		if (arr[i]==0):
			count += 1
			if (count%2==0):
				print(str(i+1)+" ",end='')

	print(" ")

	T -= 1