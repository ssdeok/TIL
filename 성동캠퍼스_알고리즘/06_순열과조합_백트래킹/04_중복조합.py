# 중복조합
# 1. 재귀
def combinations_with_replacement(current, start):
    # 1. 종료조건
    if len(current) == length:
        result.append(current[:])
        return

    # 2. 재귀식
    for i in range(start, len(numbers)):
        current.append(numbers[i])
        combinations_with_replacement(current, i)
        current.pop()

numbers = [1, 2, 3, 4]
length = 3
result = []

combinations_with_replacement([], 0)

# for line in result:
#     print(line)

# 2. 모듈
from itertools import combinations_with_replacement

numbers = [1, 2, 3, 4]
length = 3

for current in combinations_with_replacement(numbers, length):
    print(current)