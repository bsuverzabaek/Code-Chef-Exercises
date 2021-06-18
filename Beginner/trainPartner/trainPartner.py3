T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=500), "N must be 1 <= N <= 500"

	if (N%8==1):
		print(str(N+3)+"LB")
	elif (N%8==4):
		print(str(N-3)+"LB")
	elif (N%8==2):
		print(str(N+3)+"MB")
	elif (N%8==5):
		print(str(N-3)+"MB")
	elif (N%8==3):
		print(str(N+3)+"UB")
	elif (N%8==6):
		print(str(N-3)+"UB")
	elif (N%8==7):
		print(str(N+1)+"SU")
	elif (N%8==0):
		print(str(N-1)+"SL")

	T -= 1