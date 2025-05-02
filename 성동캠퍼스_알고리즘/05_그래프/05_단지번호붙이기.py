import sys

input = sys.stdin.readline

def dfs(x, y):
    global house
    house += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < n and board[nx][ny] == 1:
            board[nx][ny] = 0  # 방문처리
            dfs(nx, ny)

n = int(input())
board = [list(map(int, input().rstrip())) for _ in range(n)]
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]  # 상하좌우
result = []

for x in range(n):
    for y in range(n):
        if board[x][y] == 1:
            house = 0
            board[x][y] = 0
            dfs(x, y)
            result.append(house)

print(len(result))
print(*sorted(result), sep="\n")