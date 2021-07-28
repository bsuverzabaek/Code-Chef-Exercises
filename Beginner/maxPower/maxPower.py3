N = int(input())
assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

X = input()
count = 0

for i in range(len(X)-1,-1,-1):
	if (X[i]=='0'):
		count += 1
	else:
		break

print(count)