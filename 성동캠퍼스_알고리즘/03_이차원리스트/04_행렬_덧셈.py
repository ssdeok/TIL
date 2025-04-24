import sys

input = sys.stdin.readline

n, m = map(int, input().split())
matrix1 = [list(map(int, input().split())) for _ in range(n)]
matrix2 = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
    for j in range(m):
        matrix1[i][j] += matrix2[i][j]

for i in range(n):
    for j in range(m):
        print(matrix1[i][j], end=' ')
    print()


# for line in matrix1:
#     print(*line)