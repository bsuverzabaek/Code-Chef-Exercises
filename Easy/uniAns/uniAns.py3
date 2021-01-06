while (1):
	n = int(input())

	if (n<=-100 or n>=100):
		print("Input must be integers of one or two digits")
	elif(n!=42):
		print(n)
	elif(n==42):
		break