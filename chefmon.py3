T = int(input("Input T: "))

while(T > 0):
	total = 0
	A = list(map(int,input().split()))

	if(A[0]%A[1]==0):
		total += A[0]/A[1]
	elif(A[0]%2!=0):
		A[0] -= 1
		total += 1
		if(A[0]!=0):
			for i in range(A[1],1,-2):
				j = 1
				while(i*j<=A[0]):
					j += 1
				j -= 1
				total += j
				A[0] -= i*j
	else:
		for i in range(A[1],1,-2):
			j = 1
			while(i*j<=A[0]):
				j += 1
			j -= 1
			total += j
			A[0] -= i*j
	
	print(int(total))

	T -= 1