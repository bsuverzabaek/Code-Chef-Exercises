S = input()
assert(len(S)>=1 and len(S)<=1000000), "String must have length 1 <= |S| <= 10^6"

count = 0

for i in range(0,len(S)):
	assert(ord(S[i])>=48 and ord(S[i])<=57), "All characters must be digits"

	x = ord(S[i])-ord('0')

	if (x%8==0):
		count += 1

for i in range(1,len(S)):
	if (S[i-1]=='0'):
		continue
	
	x = (ord(S[i-1])-ord('0'))*10+(ord(S[i])-ord('0'))

	if (x%8==0):
		count += 1

nonzero = 0

for i in range(2,len(S)):
	x = (ord(S[i-2])-ord('0'))*100+(ord(S[i-1])-ord('0'))*10+(ord(S[i])-ord('0'));

	if(S[i-2]!='0'):
		nonzero += 1

	if (x%8==0):
		count += nonzero

print(count)