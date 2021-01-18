import sys

while (1):
	N = int(input())

	if (N<=0 or N>100):
		print("N must be 1 <= N <= 100")
	else:
		break

A = (list(map(int,input().split())))[:N]

for i in range(0,N):
	if (A[i]<=0 or A[i]>100):
		print("A["+str(i)+"] must be 1 <= A[i] <= 100")
		sys.exit(0)

count = 0

for i in range(0,N):
	if (A[i]%2==0):
		count += 1

if (count>N-count):
	print("READY FOR BATTLE")
else:
	print("NOT READY")