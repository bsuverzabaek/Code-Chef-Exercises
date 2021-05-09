T = int(input())
assert(T>=1 and T<=2000), "T must be 1 <= T <= 2000"

sumN = 0

while (T>0):
    N = int(input())
    assert(N>=1 and N<=2000), "N must be 1 <= N <= 2000"

    sumN += pow(N,2)

    if (T==1):
        assert(sumN<=4000000), "Sum of N^2 must be <=4*10^6"

    if (N==1):
        print("Hooray")
        print(1)
    elif (N%2!=0):
        print("Boo")
    else:
        l = list(range(1,N))
        mat = []

        for i in range(0,N):
            mat.append([0]*N)

        for i in range(1,N):
            mat[0][i] = l[i-1]
            mat[i][0] = l[i-1]+N-1

        k = 1

        for i in range(1,N):
            c = (k+1)%(N-1)
            mat[i][N-1] = l[k%(N-1)]
            mat[N-1][i] = mat[i][N-1]+N-1

            for j in range(i+1,N-1):
                mat[i][j] = l[c%(N-1)]
                mat[j][i] = mat[i][j]+N-1
                c = (c+1)%(N-1)

            k = (k+2)%(N-1)

        print("Hooray")

        for i in range(0,N):
            for j in range(0,N):
                if (i==j):
                    print(str(2*N-1) + ' ',end='')
                else:
                    print(str(mat[i][j]) + ' ',end='')
            
            print()

    T -= 1