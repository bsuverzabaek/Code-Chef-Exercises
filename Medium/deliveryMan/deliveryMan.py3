import sys

def max(a,b):
	if(a>b):
		return a
	else:
		return b

while (1):
	N,X,Y = map(int,input().split())

	if (N<=0 or N>100000):
		print("N must be 1 <= N <= 10^5")
	elif (X<=0 or X>N):
		print("X must be 1 <= X <= N")
	elif (Y<=0 or Y>N):
		print("Y must be 1 <= Y <= N")
	elif ((X+Y)<N):
		print("X + Y must be >= N")
	else:
		break

A = (list(map(int,input().split())))[:N]

for i in range(0,N):
	if (A[i]<=0 or A[i]>10000):
			print("A["+str(i)+"] must be 1 <= A[i] <= 1000")
			sys.exit(0)
		
B = (list(map(int,input().split())))[:N]

for i in range(0,N):
	if (B[i]<=0 or B[i]>10000):
			print("B["+str(i)+"] must be 1 <= B[i] <= 1000")
			sys.exit(0)
		
diff = []

for i in range(0,N):
	diff.insert(i,B[i]-A[i])

diff.sort(reverse=True)

maxTip = 0

for i in range(0,N):
	maxTip += A[i]

for i in range(0,N-X):
	maxTip += diff[i]

for i in range(N-X,Y):
	maxTip = max(maxTip+diff[i],maxTip)

print(maxTip)