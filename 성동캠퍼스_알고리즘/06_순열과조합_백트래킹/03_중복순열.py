# 중복순열
# 1. 재귀
def product(current):
    # 1. 종료조건
    if len(current) == length:
        result.append(current[:])
        return

    # 2. 재귀식
    for number in numbers:
        current.append(number)
        product(current)
        current.pop()

numbers = [1, 2, 3, 4]
length = 3
result = []

product([])

for line in result:
    print(line)

# 2. 모듈
from itertools import product

numbers = [1, 2, 3, 4]
length = 3

for current in product(numbers, repeat=length):
    print(current)