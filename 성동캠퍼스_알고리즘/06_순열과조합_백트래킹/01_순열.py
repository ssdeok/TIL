# 순열 -> 순서가 '있게' 뽑는 경우의 수
# 1. 반복문
# numbers = [1, 2, 3, 4]
# result = []

# 2. 재귀
# def permutations(current):
#     # 1. 종료조건
#     if len(current) == length:
#         result.append(current[:])
#         return
#
#     # 2. 점화식(재귀식)
#     for i in range(len(numbers)):
#         if not visited[i]:
#             visited[i] = True
#             current.append(numbers[i])
#
#             # 2. 그 다음 원소를 뽑기 위해 재귀식을 진행한다.
#             permutations(current)
#
#             # 3. 재귀식 종료 후, 뽑았던 i번째 원소를 제거한다.
#             visited[i] = False
#             current.pop()
#
#
# numbers = [1, 2, 3, 4]
# length = 3 # 내가 뽑고 싶은 갯수
# visited = [False] * len(numbers)
# result = []
#
# permutations([])
#
# for line in result:
#     print(line)

# 3. 모듈(라이브러리)
from itertools import permutations

numbers = [1, 2, 3, 4]
length = 3

for current in permutations(numbers, length):
    print(current)