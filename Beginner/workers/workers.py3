N = int(input())
assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"

c = (list(map(int,input().split())))[:N]
t = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(c[i]>=1 and c[i]<=100000), "c["+str(i)+"] must be 1 <= c[i] <= 100000"
	assert(t[i]>=1 and t[i]<=3), "t["+str(i)+"] must be 1 <= t[i] <= 3"

min = 1000000;
temp = 1000000;
temp2 = 1000000;

for i in range(0,N):
	if (t[i]==1 and c[i]<temp):
		temp = c[i]
	elif (t[i]==2 and c[i]<temp2):
		temp2 = c[i]
	elif (t[i]==3 and c[i]<min):
		min = c[i]

sum = temp + temp2

if (min<sum):
	print(min)
else:
	print(sum)