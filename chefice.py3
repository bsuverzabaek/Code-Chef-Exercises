T = int(input("Input T: "))

while (T > 0):
	N = int(input("Input N: "))

	arr = list(map(int,input().split()))

	amount = 0

	if (arr[0]==10 or arr[0]==15):
		print("No")
	else:
		amount += arr[0]
		for i in range(1,N):
			arr[i] -= 5
			amount -= arr[i]

		if (amount<0):
			print("No")
		else:
			print("Yes")

	T -= 1

