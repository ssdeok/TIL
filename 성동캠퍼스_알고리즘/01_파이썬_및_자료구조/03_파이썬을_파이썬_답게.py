numbers = []

for i in range(1, 6):
    if i % 2 == 0:
        numbers.append(i)

print(numbers)

numbers2 = [i for i in range(1, 6)]
print(numbers2)

numbers3 = [i for i in range(1, 6) if i % 2 == 0]
print(numbers3)

# 다중 할당, 패킹, 언패킹
a, b, c = 1, 2, 3
print(a, b, c)

a, b = b, a
print(a, b)

# 패킹
a, *b = 1, 2, 3, 4
print(a)
print(b)

*a, b = 1, 2, 3, 4
print(a)
print(b)

# 언패킹
numbers = [1, 2, 3]
a, b, c = numbers
print(a, b, c)

numbers = [1, 2, 3]

for number in numbers:
    print(number, end=" ")
print()

numbers = [1, 2, 3]
print(*numbers)

# enumerate
numbers = [8, 2, 5, 3]

for i in range(len(numbers)):
    print(f"{i}번째 원소 : {numbers[i]}")

for i, number in enumerate(numbers):
    print(f"{i}번째 원소 : {number}")

# Counter
numbers = [1, 2, 4, 1, 2, 2, 3, 2, 2]

counter = {}

for number in numbers:
    # 만약, 딕셔너리에 이미 있으면 -> + 1
    if number in counter:
        counter[number] += 1
    # 만약, 딕셔너리에 없으면 -> 1개로 넣어
    else:
        counter[number] = 1

print(counter)


# 카운터 모듈을 이용한 카운팅
from collections import Counter

numbers = [1, 2, 4, 1, 2, 2, 3, 2, 2]
counter = Counter(numbers)

print(counter)

common = counter.most_common()
print(common[0][0])















