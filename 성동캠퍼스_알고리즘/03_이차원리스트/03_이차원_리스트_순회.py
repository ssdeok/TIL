# 행 우선 순회 (행순회)
# matrix = [
#     [1, 2, 3, 4],
#     [5, 6, 7, 8],
#     [9, 0, 1, 2]
# ]

"""
다음과 같이 출력하여라
1 2 3 4
5 6 7 8
9 0 1 2
"""
# for i in range(3):
#     for j in range(4):
#         print(matrix[i][j], end=' ')
#     print() # 한 행을 출력 후 개행하기 위함
#
# # 열 우선 순회 (열순회)
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 0, 1, 2]
]

"""
다음과 같이 출력하여라
1 5 9
2 6 0
3 7 1
4 8 2
"""
for i in range(4):
    for j in range(3):
        print(matrix[j][i], end=' ')
    print()


# 이차원 리스트의 총합
matrix = [
    [0, 5, 3, 1],
    [4, 6, 10, 8],
    [9, -1, 1, 5]
]

total = 0

for i in range(3):
    for j in range(4):
        total += matrix[i][j]

print(total)


# 내장함수 sum 이용 가능
total = 0

# for i in range(3):
#     total += sum(matrix[i])

for line in matrix:
    total += sum(line)

print(total)