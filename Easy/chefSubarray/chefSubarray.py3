N = int(input())
assert(N>=1 and N<=100000), "N must be 1 <= N <= 100000"

A = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(A[i]>=0 and A[i]<=10000), "A["+str(i)+"] must be 0 <= A[i] <= 10000"

if (A[0]==0):
	count = 0
else:
	count = 1

max = count

for i in range(1,N):
	if (A[i]!=0):
		count += 1
	else:
		if (count>max):
			max = count
		
		count = 0
	
print(max)