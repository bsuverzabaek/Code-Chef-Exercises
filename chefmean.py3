def sum(arr):
	sum = 0

	for i in arr:
		sum += i

	return sum

T = int(input("Input T: "))

while (T > 0):
	N = int(input("Input N: "))

	arr = list(map(int,input().split()))

	s = sum(arr)

	count = 0

	for i in range(len(arr)):
		if(s*(N-1) == N*(s-arr[i])):
			if(count==0):
				print(i+1)
				count += 1

	if(count==0):
		print("Impossible")

	T -= 1