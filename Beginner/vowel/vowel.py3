while (1):
	C = input()[0]

	if (ord(C)<=64 or ord(C)>=91):
		print("Character C must be an upper case English letter")
	else:
		break

if (C=='A' or C=='E' or C=='I' or C=='O' or C=='U'):
	print("Vowel")
else:
	print("Consonant")
				