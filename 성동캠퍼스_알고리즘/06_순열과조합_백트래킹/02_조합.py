# 조합 : 순서가 '없게' 뽑는 경우의 수
# current - 현재 내가 뽑은 숫자들
# start - 내가 다음 숫자를 어디서부터 뽑을지에 대한 인덱스
# 1. 재귀
def combinations(current, start):
    # 1. 종료조건
    if len(current) == length:
        result.append(current[:])
        return

    # 2. 재귀식
    for i in range(start, len(numbers)):
        current.append(numbers[i])
        combinations(current, i + 1)
        current.pop()

numbers = [1, 2, 3, 4]
length = 3
result = []

combinations([], 0)

for line in result:
    print(line)

# 2. 모듈
from itertools import combinations

numbers = [1, 2, 3, 4]
length = 3

for current in combinations(numbers, length):
    print(current)