import sys

input = sys.stdin.readline

n = int(input())
paper = [[0] * 100 for _ in range(100)]

for _ in range(n):
    x, y = map(int, input().split())

    for i in range(x, x + 10):
        for j in range(y, y + 10):
            paper[i][j] = 1

# total = 0
#
# for i in range(100):
#     for j in range(100):
#         total += paper[i][j]

total = sum(map(sum, paper))
print(total)