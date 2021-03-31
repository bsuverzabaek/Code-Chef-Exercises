T = int(input())
assert(T>=1 and T<=5000), "T must 1 <= T <= 5000"

while (T>0):
	K,N = map(int,input().split())

	assert(K>=1 and K<=100), "K must be 1 <= K <= 100"
	assert(N>=1 and N<=1000000000), "N must be 1 <= N <= 10^9"

	x = []
	y = []

	for i in range(0,K):
		xi,yi = map(int,input().split())

		assert(xi>=0 and xi<=N-1), "x must be 0 <= x <= N-1"
		assert(yi>=0 and yi<=N-1), "y must be 0 <= y <= N-1"

		x.append(xi)
		y.append(yi)

	if (K==1):
		if ((x[0]==0 or x[0]==N-1) and (y[0]==0 or y[0]==N-1)):
			print("yes")
		else:
			print("no")
	elif (K==2):
		if ((x[0]==0 or x[0]==N-1) and (y[0]==0 or y[0]==N-1)):
			print("yes")
		elif ((x[1]==0 or x[1]==N-1) and (y[1]==0 or y[1]==N-1)):
			print("yes")
		elif ((y[0]==0 or y[0]==N-1) and (y[1]==0 or y[1]==N-1)):
			print("yes")
		else:
			print("no")
	elif (K==3):
		if ((x[0]==0 or x[0]==N-1) and ((y[0]>=y[1] and y[0]>=y[2]) or (y[0]<=y[1] and y[0]<=y[2]))):
			print("yes")
		elif ((y[0]==0 or y[0]==N-1) and ((x[0]>=x[1] and x[0]>=x[2]) or (x[0]<=x[1] and x[0]<=x[2]))):
			print("yes")
		elif ((x[1]==0 or x[1]==N-1) and ((y[1]>=y[0] and y[1]>=y[2]) or (y[1]<=y[0] and y[1]<=y[2]))):
			print("yes")
		elif ((y[1]==0 or y[1]==N-1) and ((x[1]>=x[0] and x[1]>=x[2]) or (x[1]<=x[0] and x[1]<=x[2]))):
			print("yes")
		elif ((x[2]==0 or x[2]==N-1) and ((y[2]>=y[0] and y[2]>=y[1]) or (y[2]<=y[0] and y[2]<=y[1]))):
			print("yes")
		elif ((y[2]==0 or y[2]==N-1) and ((x[2]>=x[0] and x[2]>=x[1]) or (x[2]<=x[0] and x[2]<=x[1]))):
			print("yes")
		elif ((x[2]==0 or x[2]==N-1) and ((y[1]==0 or y[1]==N-1) or (y[0]==0 or y[0]==N-1))):
			print("yes")
		elif ((x[1]==0 or x[1]==N-1) and ((y[2]==0 or y[2]==N-1) or (y[0]==0 or y[0]==N-1))):
			print("yes")
		elif ((x[0]==0 or x[0]==N-1) and ((y[1]==0 or y[1]==N-1) or (y[2]==0 or y[2]==N-1))):
			print("yes")
		else:
			print("no")
	elif (K>=4):
		print("yes")

	T -= 1