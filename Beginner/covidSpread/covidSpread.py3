import sys

def min(best,num):
	if (best<num):
		return best
	else:
		return num

def max(worst,num):
	if (worst>num):
		return worst
	else:
		return num

while (1):
	T = int(input())

	if (T<=0 or T>2000):
		print("T must be 1 <= T <= 2000")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=1 or N>8):
			print("N must be 2 <= N <= 8")
		else:
			break

	X = list(map(int,input().split()))

	for i in range(0,N):
		if (X[i]<0 or X[i]>10):
			print("X["+str(i)+"] must be 0 <= X[i] <= 10")
			sys.exit(0)

	for i in range(0,N-1):
		if (X[i]>=X[i+1]):
			print("Each X[i] must be less than X[i+1]")
			sys.exit(0)

	l = 0
	best = N
	worst = 0

	for i in range(0,N):
		if (i!=0 and X[i]-X[i-1]>2):
			l = i
		if (i+1==N or X[i+1]-X[i]>2):
			num = i - l + 1
			best = min(best,num)
			worst = max(worst,num)

	print(str(best) + " " + str(worst))
			
	T -= 1	