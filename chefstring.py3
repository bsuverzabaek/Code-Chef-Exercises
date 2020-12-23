T = int(input("Input T: "))

while (T > 0):
	S = input()

	i = 1
	count = 0

	while (i < len(S)):
		if((S[i-1]=='x' and S[i]=='y') or (S[i-1]=='y' and S[i]=='x')):
			count += 1
			ls = list(S)
			ls[i] = 'o'
			S = ''.join(ls)
		i += 1

	print(count)

	T -= 1