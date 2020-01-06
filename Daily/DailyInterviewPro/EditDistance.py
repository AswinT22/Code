def distance(s1,n, s2,m):
# Fill this in.
    table = [[0] * (m+1) for i in range(n+1)]

    for i in range(0, n+1):
        table[i][0] = i

    for j in range(0, m+1):
        table[0][j] = j
    for i in range(1, n+1):
        for j in range(1, m+1):
            if s1[i-1] == s2[j-1]:
                table[i][j] = table[i-1][j-1]
            else:
                table[i][j] = min(table[i-1][j-1]+1, table[i][j-1]+1, table[i-1][j]+1)

    return table[n][m]


for _ in range(int(input())):
    n, m = map(int, input().split())
    s1, s2 = input().split()
    print(distance(s1, n, s2, m))
