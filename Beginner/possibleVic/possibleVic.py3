R,O,C = map(int,input().split())

assert(C>=0 and C<=R and R <= 720), "C and R must be 0 <= C <= R <= 720"
assert(O>=1 and O<=19), "O must be 1 <= O <= 19"
assert(C<=36*O), "C must be 0 <= C <= 36*O"

if ((20-O)*36>(R-C)):
	print("YES")
else:
	print("NO")