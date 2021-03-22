d = {0:1}
s4 = [0]
s7 = [0]

for i in range(1,100001):
	v = str(i)
	s4.append(s4[-1]+v.count('4'))
	s7.append(s7[-1]+v.count('7'))

s4_7 = [0]

for i in range(1,100001):
	s4_7.append(s4[i]-s7[i])

ans = [0]

for i in range(1,100001):
	v = s4_7[i]

	if (v in d):
		ans.append(ans[-1]+d[v])
		d[v] += 1
	else:
		ans.append(ans[-1])
		d[v] = 1

T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	print(ans[N])

	T -= 1