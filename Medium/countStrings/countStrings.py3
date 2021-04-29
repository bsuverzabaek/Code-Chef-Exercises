S = input()
assert(len(S)>=1 and len(S)<=100000), "String of S must have length 1 <= |S| <= 10^5"

MOD = 1000000007

ans = 0

ans += ord('Z')-ord(S[0])
prefix = ord('Z')-ord(S[0])

for i in range(1,len(S)):
	x = ord('Z')-ord(S[i])
	ans = (ans+((prefix+1)*x))%MOD
	prefix = ((26*prefix)+x)%MOD

print(ans)