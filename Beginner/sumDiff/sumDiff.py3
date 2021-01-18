while (1):
	N1 = int(input())
	N2 = int(input())

	if (N1<-1000 or N1>1000):
		print("N1 must be -1000 <= N1 <= 1000")
	elif (N2<-1000 or N2>1000):
		print("N2 must be -1000 <= N2 <= 1000")
	else:
		break

if (N1>N2):
	print(N1-N2)
else:
	print(N1+N2)