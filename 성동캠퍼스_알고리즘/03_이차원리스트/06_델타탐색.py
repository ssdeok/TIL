# 델타(delta) 탐색
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

n = len(matrix)
m = len(matrix[0])

# 1. 기준점 잡기
x = 1
y = 1

# 2. 델타값 정의
dx = [-1, 1, 0, 0] # 상하좌우
dy = [0, 0, -1, 1]

# 3. 이동하기
# 상
nx = x + dx[0] # 0
ny = y + dy[0] # 1

# 하
nx = x + dx[1]
ny = y + dy[1]

# 좌
nx = x + dx[2]
ny = y + dy[2]

# 우
nx = x + dx[3]
ny = y + dy[3]

# 4. 범위 확인 및 실제 이동
if 0 <= nx < n and 0 <= ny < m:
    x = nx
    y = ny


# 번외: 반복문을 이용해 4방향 탐색하기
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

n = len(matrix)
m = len(matrix[0])

# 1. 기준점 잡기
x, y = 1, 1

# 2. 델타값 정의
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 3. 이동하기
for i in range(4):  # 상 -> 하 -> 좌 -> 우
    nx = x + dx[i]
    ny = y + dy[i]

# 4. 범위 확인 및 출력
    if 0 <= nx < n and 0 <= ny < m:
        print(matrix[nx][ny])


# 번외 : 8방향은 어떻게할까?
dx = [-1, 1, 0, 0, -1, -1, 1, 1]
dy = [0, 0, -1, 1, -1, 1, -1, 1]








