def p_first(arr,n):
	p = 0
	p += arr[0]

	if(n > 2):
		for i in range(3,n,2):
			p += arr[i]
	return p

def p_second(arr,n):
	p = 0
	if(n == 1):
		return p
	elif(n == 2):
		p += arr[1]
		return p
	elif(n == 3):
		p += arr[1]
		p += arr[2]
		return p
	else:
		p += arr[1]
		p += arr[2]
		for i in range(4,n,2):
			p += arr[i]
		return p

T = int(input("Input T: "))

while (T > 0):
	n = int(input("Input n: "))

	arr = (list(map(int,input().split())))[:n]

	if(p_first(arr,n) == p_second(arr,n)):
		print("draw")
	elif(p_first(arr,n) > p_second(arr,n)):
		print("first")
	else:
		print("second")

	T -= 1