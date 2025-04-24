# 시계 방향 90도 회전 (오른쪽으로 회전)
"""
행 4
열 3
[
  [9, 5, 1],
  [0, 6, 2],
  [1, 7, 3],
  [2, 8 ,4]
]
"""
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 0, 1, 2]
]

n = 3
m = 4

# 1. 행과 열의 크기를 바꾼 새로운 이차원 리스트를 초기화 => 모든 원소를 0으로 만듦
rotated_matrix = [[0] * n for _ in range(m)]

# for _ in range(m):
#     line = [0] * n
#     rotated_matrix.append(line)
#
# print(rotated_matrix)

# 2. 반복문을 돌면서 새로운 이차원 리스트를 채워나간다
for i in range(m):
    for j in range(n):
        rotated_matrix[i][j] = matrix[n - 1 - j][i]

for line in rotated_matrix:
    print(line)


# 내장함수 zip을 이용한 시계방향 90도 회전
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 0, 1, 2]
]

# 일단 zip에 대해 알아보자
a = list(zip([1, 2], [3, 4], [5, 6]))
print(a)

# 이제 zip을 이용해서 회전해보자
print(list(zip(matrix)))
print(list(zip(*matrix)))
print(list(zip(*matrix[::-1])))

rotated_matrix = list(map(list, zip(*matrix[::-1])))

for line in rotated_matrix:
    print(line)














