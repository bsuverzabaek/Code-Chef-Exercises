T = int(input())
assert(T>=1 and T<=64), "T must be 1 <= T <= 64"

while (T>0):
	S,W1,W2,W3 = map(int,input().split())

	assert(S>=1 and S<=8), "S must be 1 <= S <= 8"
	assert((W1>=1 and W1<=2) and (W2>=1 and W2<=2) and (W3>=1 and W3<=2)), "Each width must be 1 <= W <= 2"

	if (S>=W1+W2+W3):
		print("1")
	elif (S>=W1+W2 or S>=W2+W3):
		print("2")
	else:
		print("3")

	T -= 1